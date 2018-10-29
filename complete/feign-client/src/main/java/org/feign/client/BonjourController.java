package org.feign.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BonjourController {

    @RequestMapping("/greeting")
    public String greeting() {
	return "bonjour";
    }
}
