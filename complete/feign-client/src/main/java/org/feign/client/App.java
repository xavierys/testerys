package org.feign.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import feign.Client;
import feign.Contract;
import feign.Feign;
import feign.codec.Decoder;
import feign.codec.Encoder;

@SpringBootApplication
@Import(FeignClientsConfiguration.class)
//@EnableFeignClients
public class App {

    // @Autowired
    // private BeautifulClient beautifulClient;
    
    private BeautifulClient github;    
    

    public static void main(String[] args) {
	SpringApplication.run(App.class, args);	

    }

     @RequestMapping(method=RequestMethod.GET, value="/getInfoService/{service}")
    public String getInfoService(Model model, @PathVariable("service") String service) {
     model.addAttribute("infoService",
	     github.serviceInstancesByApplicationName(service));
     return null;
     }
    
    @Autowired
    public App(Decoder decoder, Encoder encoder, Client client, Contract contract) {
	BeautifulClient github = Feign.builder().decoder(decoder).target(BeautifulClient.class, "http://localhost:8080/service-instances/a-bootiful-client");

	github.serviceInstancesByApplicationName("a-bootiful-client");
    }

//    @RequestMapping("/test/")
//    public String test() {
//	return github.serviceInstancesByApplicationName("a-bootiful-client").toString();
//    }

}
