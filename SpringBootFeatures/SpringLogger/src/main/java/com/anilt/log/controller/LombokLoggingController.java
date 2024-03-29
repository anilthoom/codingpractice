package com.anilt.log.controller;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
//@Log4j2
public class LombokLoggingController {
    @RequestMapping("/lombok")
    public String index() {
        log.trace("A TRACE Message");
        log.debug("A DEBUG Message");
        log.info("An INFO Message");
        log.warn("A WARN Message");
        log.error("An ERROR Message");
        try{
            String str = null;
            str.getBytes();
        }catch (Exception e){
            log.error("ERROR", e);
        }
        return "Howdy! Check out the Logs to see the output...";
    }
}
