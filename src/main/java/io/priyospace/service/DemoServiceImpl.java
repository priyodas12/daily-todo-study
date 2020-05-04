package io.priyospace.service;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DemoServiceImpl implements DemoService{

    //model methods
    @Override
    public String getHelloMessage(String user) {
        return "Hello "+user;
    }

    @Override
    public String getWelcomeMessage() {
        return "Welcome to this service demo app!"+" on "+new Date();
    }
}
