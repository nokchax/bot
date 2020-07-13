package com.nokchax.bot.endpoint.crawl.domain;

import java.time.LocalDateTime;

public class Page {
    private int id;
    private String name; // title?
    private String url; // 해당 페이지 url
    private String pathType; // xpath인지 아니면 <body> <table> <td>처럼 tag를 타고 들어가는 path인지.. id인지 class인지..
    private String path; // 실 path를 담는다
    private String alramType; // 어느 경우에 알람을 할 것인지 updated, word matched...
    private String matchWord; // 단어 비교를 할때 사용 startWith, endWith, contains, notcontains...
    private String lastPage; // 마지막 페이지 크롤 정보
    private String crawlTerm; // 크롤하는 텀
    private LocalDateTime lastCrawlTime; // 마지막 크롤 시점 -> history table도 만드는게 좋을듯
}
