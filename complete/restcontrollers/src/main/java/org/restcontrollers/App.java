package org.restcontrollers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;   

@SpringBootApplication
public class App 
{
    
//    @Autowired
//    private BeautifulClient beautifulClient;
    
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
    
//    @RequestMapping("/getInfoService/{service}")
//    public String getInfoService(Model model, @PathVariable("service") String service) {
//	model.addAttribute("infoService", beautifulClient.serviceInstancesByApplicationName(service));
//	return null;
//    }
//    
//    @RequestMapping("/test/")
//    public String test() {
//	return "test";
//    }
    
    
}

