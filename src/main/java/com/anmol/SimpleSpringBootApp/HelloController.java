package com.anmol.SimpleSpringBootApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    Environment environment;

    @Value("${app.message}")
    private String message;


     Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/hello")
    public String hello() {
        return message;
    }

    @GetMapping("/greet")
    public String greet(@RequestParam("name") String name) {
        return  "Hi, "+ name + "! Greetings from GreetingController!";
    }

    @GetMapping("/status")
    public String status() {
        String msg = environment.getProperty("STATUS");
        logger.info(msg);
        return "Status is OK! "+msg;
    }


}
