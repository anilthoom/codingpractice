package com.anilt.json.compare.controller;

import com.google.gson.JsonElement;
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
        String objectString = "{\"customer\": {\"fullName\": \"Emily Jenkins\", \"age\": 27 }}";
        String arrayString = "[10, 20, 30]";
        JsonElement json1 = parser.parse(objectString);
        JsonElement json2 = parser.parse(arrayString);
        return "OK : "+json1.isJsonObject();
    }
}
