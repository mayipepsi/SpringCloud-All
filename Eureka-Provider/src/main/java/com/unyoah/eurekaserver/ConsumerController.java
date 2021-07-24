package com.unyoah.eurekaserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ConsumerController {

    @GetMapping("/getMap")
    public Map<String, String> getMap() {

        HashMap<String, String> map = new HashMap<>();
        map.put("name", "500");
        return map;
    }




}
