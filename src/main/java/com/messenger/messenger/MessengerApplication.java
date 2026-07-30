package com.messenger.messenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessengerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessengerApplication.class, args);
    }

    public void testFunction() {
        System.out.println("test");
    }
    public void testFunction2(){
        System.out.println("test2");

    }

}
