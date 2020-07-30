package com.nokchax.bot.endpoint.crawl.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Filter {
    @EmbeddedId
    private FilterId filterId;
    private TargetType targetType;
    private FilterType filterType;
    private ResultType resultType;
}
