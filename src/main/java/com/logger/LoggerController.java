package com.logger;

import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;
import ch.qos.logback.core.rolling.TimeBasedRollingPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liaoyubo
 * @version 1.0 2017/6/15
 * @description
 */
@RestController
public class LoggerController {

    private static Logger logger = LoggerFactory.getLogger(LoggerController.class);

    @RequestMapping("/getLogger")
    public ResponseEntity getLogger(){
        logger.trace("======trace");
        logger.debug("======debug");
        logger.info("======info");
        logger.warn("======warn");
        logger.error("======error");
        return ResponseEntity.ok("get Logger");
    }

}
