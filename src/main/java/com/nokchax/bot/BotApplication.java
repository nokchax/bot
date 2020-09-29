package com.nokchax.bot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.telegram.telegrambots.ApiContextInitializer;

@EnableScheduling
@SpringBootApplication
@ConfigurationPropertiesScan("com.nokchax.bot.config")
public class BotApplication {

    public static void main(String[] args) {
        ApiContextInitializer.init(); // init telegram bot

        SpringApplication.run(BotApplication.class, args);
    }

}
