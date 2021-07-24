package com.unyoah.eurekaserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;


    @GetMapping("test")
    public Map<String, Object> test(){

        String url ="http://Eureka-Provider/getMap";
        ResponseEntity<Map> entity = restTemplate.getForEntity(url, Map.class);
        System.out.println("respStr: "  + entity.getBody() );

        return entity.getBody();
    }
}
