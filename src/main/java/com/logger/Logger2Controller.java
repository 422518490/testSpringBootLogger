package com.logger;

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
public class Logger2Controller {

    private static Logger logger = LoggerFactory.getLogger(Logger2Controller.class);

    @RequestMapping("/get2Logger")
    public ResponseEntity get2Logger(){
        logger.trace("======trace");
        logger.debug("======debug");
        logger.info("======info");
        logger.warn("======warn");
        logger.error("======error");
        for (int i = 0;i <= 50000;i++){
            logger.trace("======trace");
            logger.debug("======debug");
            logger.info("======info");
            logger.warn("======warn");
            logger.error("======error");
        }
        return ResponseEntity.ok("get 2 Logger");
    }

}
