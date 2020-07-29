package com.nokchax.bot.endpoint.crawl.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Filter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //embedded
    private int order;
    private String targetType; // string or tag
    private FilterType filterType;
    private ResultType resultType;
}
