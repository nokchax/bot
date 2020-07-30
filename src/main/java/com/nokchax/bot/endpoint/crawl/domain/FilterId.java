package com.nokchax.bot.endpoint.crawl.domain;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Data
@Embeddable
public class FilterId implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int order;
}
