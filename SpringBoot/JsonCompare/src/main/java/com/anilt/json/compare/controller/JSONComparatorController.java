package com.anilt.json.compare.controller;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.junit.Assert.*;

@RestController
@RequestMapping("/compare")
public class JSONComparatorController {
    @GetMapping("/")
    public String isObjectSame(){

        JsonParser parser = new JsonParser();
        String objectString = "{\n" +
                "    \"customer\": {\n" +
                "        \"id\": 44521,\n" +
                "        \"fullName\": \"Emily Jenkins\",\n" +
                "        \"age\": 27\n" +
                "    }\n" +
                "}";
        String arrayString = "{\n" +
                "    \"customer\": {\n" +
                "        \"id\": 44521,\n" +
                "        \"age\": 27,\n" +
                "        \"fullName\": \"Emily Jenkins\"\n" +
                "    }\n" +
                "}";
        JsonElement json1 = parser.parse(objectString);
        JsonElement json2 = parser.parse(arrayString);
        assertEquals(json1, json2);

        return "OK : "+json2.isJsonObject();
    }
}
