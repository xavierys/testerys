package org.feign.client;

import java.util.List;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("a-bootiful-client")
public interface BeautifulClient {
    @RequestMapping(method=RequestMethod.GET, value="/service-instances/{applicationName}")
    List<ServiceInstance> serviceInstancesByApplicationName(@PathVariable("applicationName") String applicationName);
}
