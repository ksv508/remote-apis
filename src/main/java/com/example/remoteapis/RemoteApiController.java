package com.example.remoteapis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RemoteApiController {
    @Autowired
    RestTemplate restTemplete;
    @GetMapping("/get")
    public Object getMoviesDetails(){
        String url = "";
        Object responseObject = restTemplete.getForObject(url,Object.class);
        return responseObject;
    }
}
