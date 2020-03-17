package org.pratap.ws.web.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @RequestMapping("/health")
    @GetMapping
    public String healthCheck(){
        return "OK";
    }
}
