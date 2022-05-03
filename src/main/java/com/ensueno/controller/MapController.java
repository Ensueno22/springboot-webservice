package com.ensueno.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class MapController {

    @GetMapping("/")
    public String main() {
        return "index";
    }

    @GetMapping("/map")
    public String map() {
        return "kakaomap";
    }

    @GetMapping("/distance")
    public String distance() {
        return "distance";
    }

    @GetMapping("/newmap")
    public String newmap() {
        return "newmap";
    }
}
