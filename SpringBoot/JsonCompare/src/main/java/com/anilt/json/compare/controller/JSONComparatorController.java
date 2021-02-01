package com.anilt.json.compare.controller;

import com.google.gson.JsonParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compare")
public class JSONComparatorController {
    @GetMapping("/")
    public String isObjectSame(){

        JsonParser parser = new JsonParser();

        return "OK";
    }
}
