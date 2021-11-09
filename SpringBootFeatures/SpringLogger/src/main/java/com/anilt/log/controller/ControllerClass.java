package com.anilt.log.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
    public static final Logger LOGGER = LoggerFactory.getLogger(ControllerClass.class);

    @RequestMapping("/")
    public String index() {
        LOGGER.trace("A TRACE Message");
        LOGGER.debug("A DEBUG Message");
        LOGGER.info("An INFO Message");
        LOGGER.warn("A WARN Message");
        LOGGER.error("An ERROR Message");
        try{
            String str = null;
            str.getBytes();
        }catch (Exception e){
            LOGGER.error("Error");
        }

        return "Howdy! Check out the Logs to see the output...";
    }
}
