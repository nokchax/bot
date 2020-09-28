package com.nokchax.bot.endpoint.crawl.domain;

public enum FilterType {
    MATCH_EXACT, // 정확히 일치, equals
    EXCLUDE_EXACT, // 포함하면 안됨, not equals
    CONTAIN, // contains
    START_WITH, // startWith
    END_WITH, // endWith
    EXCLUDE // not contains
}
