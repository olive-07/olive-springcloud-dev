package com.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author olive
 * @date 2017-07-08
 */
@RestController
public class TestController {

	@Autowired
	ServiceAFeignClient serviceAFeignClient;

	@RequestMapping("/hi")
	public String hi(@RequestParam String id) {
		return serviceAFeignClient.hi(id);
	}
}
