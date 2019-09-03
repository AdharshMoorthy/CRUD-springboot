package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Application lanch class
 * @author adharsh.moorthy
 */
@SpringBootApplication
@ComponentScan("com.springboot")
public class Application {
	
    public static void main( String[] args ) {
    	SpringApplication.run(Application.class, args);
    }
}
