package com.example.ticketsystemservice.controller;

import com.example.ticketsystemservice.dao.TicketSystemDoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketSystemController {
    @Autowired
    TicketSystemDoa tcdao;

    @RequestMapping("/yeardata")
    public List<Integer> all(){
        return tcdao.getTicketPerYear();
    }


}
