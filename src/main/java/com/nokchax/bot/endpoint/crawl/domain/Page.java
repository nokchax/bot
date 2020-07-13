package com.nokchax.bot.endpoint.crawl.domain;

public class Page {
    private int id;
    private String name; // title?
    private String url; // 해당 페이지 url
    private String pathType; // xpath인지 아니면 <body> <table> <td>처럼 tag를 타고 들어가는 path인지.. id인지 class인지..
    private String path; // 실 path를 담는다
    private String alramType; // 어느 경우에 알람을 할 것인지
}
