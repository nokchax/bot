package com.nokchax.bot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.telegram.telegrambots.ApiContextInitializer;

@EnableScheduling
@SpringBootApplication
public class BotApplication {

    public static void main(String[] args) {
        ApiContextInitializer.init(); // init telegram bot

        SpringApplication.run(BotApplication.class, args);
    }

}
