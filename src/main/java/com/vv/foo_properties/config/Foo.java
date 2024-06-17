package com.vv.foo_properties.config;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties
@PropertySource( "classpath:foo.properties" )
public class Foo {
    private long id;

    private String name;

    public long getId() {
        return id;
    }

    public void setId( final long id ) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName( final String name ) {
        this.name = name;
    }

    @PostConstruct
    public void init() {
        // start your monitoring in here
        System.out.println( this.getId() + "   " + this.getName() );
    }
}
