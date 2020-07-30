package com.nokchax.bot.endpoint.crawl.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Crawl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private boolean isActive;
    private String lastCrawlInfo; // 여기 아니면 history?
    private LocalDateTime lastCrawlTime;

    @OrderBy("id desc")
    @OneToMany
    private List<CrawlHistory> histories = new ArrayList<>();
}
