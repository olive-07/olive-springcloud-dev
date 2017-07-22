package com.info;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author olive
 * @date 2017-07-08
 */
@Component
@FeignClient(value = "olive-service-a", fallback = ServiceAFeignClientFallback.class) // 这里的value对应服务的spring.applicatoin.name
public interface ServiceAFeignClient {

	@RequestMapping(value = "/hi")
	String hi(@RequestParam("id") String id);

}
