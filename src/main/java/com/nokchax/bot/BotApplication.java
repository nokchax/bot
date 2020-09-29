package com.nokchax.bot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.telegram.telegrambots.ApiContextInitializer;

@EnableScheduling
@SpringBootApplication
@ConfigurationPropertiesScan("com.nokchax.bot.config")
public class BotApplication {
    private static final String EXTERNAL_CONFIG_FILE = "/data/etc/bot/bot-api.yml";

    public static void main(String[] args) {
        ApiContextInitializer.init(); // init telegram bot

        new SpringApplicationBuilder()
                .sources(BotApplication.class)
                .properties("spring.config.additional-location=file:" + EXTERNAL_CONFIG_FILE)
                .run(args);
    }
    // make it run both window and mac env
}
