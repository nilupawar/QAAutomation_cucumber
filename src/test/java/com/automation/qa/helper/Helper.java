package com.automation.qa.helper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("application-${spring.profiles.active}.properties")
@Component
public class Helper {
    @Value("${name}")
    private String name;

    @Value("${secondname}")
    private String secondName;

    private int count;

    public int getCount(){
        return count;
    }
    public void incrementCount(){
        count++;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }
}
