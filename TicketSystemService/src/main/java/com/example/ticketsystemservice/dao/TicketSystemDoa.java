package com.example.ticketsystemservice.dao;

import com.example.ticketsystemservice.bean.TicketSystemBean;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TicketSystemDoa {
    public List<TicketSystemBean> getTicketStats(){
        List<TicketSystemBean> tickList = new ArrayList<TicketSystemBean>();
        TicketSystemBean tcb = new TicketSystemBean(2000, 700, 2024);
        tickList.add(tcb);
        tcb = new TicketSystemBean(3000, 700, 2024);
        tickList.add(tcb);
        tcb = new TicketSystemBean(1200, 300, 2023);
        tickList.add(tcb);
        tcb = new TicketSystemBean(4300, 100, 2022);
        tickList.add(tcb);
        tcb = new TicketSystemBean(5800, 350, 2021);
        tickList.add(tcb);
        return tickList;
    }
    public List<Integer> getTicketPerYear(){
        List<Integer> tickCount = new ArrayList<>();
        tickCount.add(2000);
        tickCount.add(3000);
        tickCount.add(1200);
        tickCount.add(4300);
        tickCount.add(5800);
        return tickCount;
    }
}
