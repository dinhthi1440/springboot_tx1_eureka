package com.example.employeeaccessservice.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@Api(tags={"MsgConfigServer"})
public class MessageFromConfig {
	
	@Value("${msg:Hello - Config Server is not working..pelase check}")
    private String message;
	
    @RequestMapping("/message")
    String getMessage() {
        return this.message;
    }

}
