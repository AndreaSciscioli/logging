package co.develhope.logging.controllers;

import co.develhope.logging.services.BasicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class BasicController {
    Logger logger = LoggerFactory.getLogger(BasicController.class);
    @Autowired
    BasicService basicService;
    @GetMapping("/")
    public String welcome(){
        return "welcome";
    }
    @GetMapping("/exp")
    public double power(){
        return basicService.power();
    }
    @GetMapping("/get-error")
    public void throwError(){
        logger.error("there is an error");
    }
}
