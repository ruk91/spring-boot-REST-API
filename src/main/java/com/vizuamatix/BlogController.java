package com.vizuamatix;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//  @RestController annotation tells that this class is a controller
@RestController
public class BlogController {

    @RequestMapping("/")
    public String index() {
        return "It is my first Spring App";
    }

}
