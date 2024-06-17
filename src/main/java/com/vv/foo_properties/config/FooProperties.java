package com.vv.foo_properties.config;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//@Component
//@ConfigurationProperties
//@PropertySource("classpath:foo.properties")
public class FooProperties {
    private Foo foo;
    // getters and setters

    @PostConstruct
    public void init(){
        // start your monitoring in here
        System.out.println(foo.getId()+"   "+foo.getName());
    }
}
