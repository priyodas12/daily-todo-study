package io.priyospace.service;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DemoServiceImpl implements DemoService{
    @Override
    public String getHelloMessage(String user) {
        return "Hello "+user+" now "+new Date();
    }

    @Override
    public String getWelcomeMessage() {
        return "Welcome to this service demo app!";
    }
}
