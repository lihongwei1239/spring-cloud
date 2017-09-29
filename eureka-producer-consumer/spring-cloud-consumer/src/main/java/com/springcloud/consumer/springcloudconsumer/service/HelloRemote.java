package com.springcloud.consumer.springcloudconsumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("spring-cloud-producer")
public interface HelloRemote {

    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name);


}
