package com.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author olive
 * @date 2017-07-08
 */
@RestController
//@RefreshScope
public class TestController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/hi")
	@HystrixCommand(fallbackMethod = "hiFallback")
	public String hi(@RequestParam String id) {
		String a = restTemplate.getForObject("http://olive-service-a/hi?id=" + id, String.class);
		String b = restTemplate.getForObject("http://olive-service-b/hi?id=" + id, String.class);
		return a+b;
	}

	public String hiFallback(String id) {
		return "hi, " + id + ", error!";
	}

//	@Value("${ip}")
//	private String ip;
//	@Value("${port}")
//	private String port;
//
//	@RequestMapping("/getProperties")
//	public String getProperties() {
//		return ip + " : " + port;
//	}
}
