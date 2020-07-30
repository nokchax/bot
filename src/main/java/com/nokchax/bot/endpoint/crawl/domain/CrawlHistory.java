package com.nokchax.bot.endpoint.crawl.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class CrawlHistory {
    @Id
    @GeneratedValue
    private int id;
    private LocalDateTime crawlTime;
}
