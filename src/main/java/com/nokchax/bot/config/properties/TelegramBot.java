package com.nokchax.bot.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "telegram-bot")
public class TelegramBot {
    private String name;
    private String token;
}
