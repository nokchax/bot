package com.nokchax.bot.endpoint.crawl.domain;

import java.time.LocalDateTime;
import java.util.function.BiFunction;

// use this
// https://stackoverflow.com/questions/23835171/cronexpression-parsing-into-java-date
public enum TermType {
    SECOND(LocalDateTime::plusSeconds),
    MINUTE(LocalDateTime::plusMinutes),
    HOUR(LocalDateTime::plusHours),
    DAY(LocalDateTime::plusDays),
    WEEK(LocalDateTime::plusWeeks),
    MONTH(LocalDateTime::plusMonths),
    YEAR(LocalDateTime::plusYears);

    private final BiFunction<LocalDateTime, Long, LocalDateTime> calculator;

    TermType(BiFunction<LocalDateTime, Long, LocalDateTime> calculator) {
        this.calculator = calculator;
    }

    public LocalDateTime calcNextCrawlTime(LocalDateTime prevCrawlTime, long term) {
        return calculator.apply(prevCrawlTime, term);
    }
}

