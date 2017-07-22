package com.info;

import org.springframework.stereotype.Component;

/**
 * @author olive
 * @date 2017-07-08
 */
@Component
public class ServiceAFeignClientFallback implements ServiceAFeignClient {

    @Override
    public String hi(String id) {
        return "hi, " + id + ", error!";
    }

}
