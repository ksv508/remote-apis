package com.example.remoteapis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/remote")
public class RemoteApiController {
    @Autowired
    RestTemplate restTemplete;
    @GetMapping("/get")
    public Object getMoviesDetails(){
        String url = "https://api.themoviedb.org/3/movie/157336?api_key=6af22436795bf2ad44c1e55056559deb";
        Object responseObject = restTemplete.getForObject(url,Object.class);
        return responseObject;
    }
    @GetMapping("/get_custom_details")
    public MovieResponse getCustomMovieDetails(){
        String url = "https://api.themoviedb.org/3/movie/157336?api_key=6af22436795bf2ad44c1e55056559deb";
        MovieResponse responseObject = restTemplete.getForObject(url,MovieResponse.class);
        return responseObject;
    }
}
