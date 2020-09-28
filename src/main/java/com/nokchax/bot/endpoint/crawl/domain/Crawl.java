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
    private String name; // 크롤 타이틀..?
    private boolean isActive; // 실행할 것인지 아닌지
    private String lastCrawlInfo; // 여기 아니면 history?
    private long crawlTerm; // 크롤 주기..? cronExp만 있으면 되는 것 아닌가??..
    private String cronExp; // 크롤 exp..
    private LocalDateTime nextCrawlTime; // 다음 크롤 시간
    private LocalDateTime lastCrawlTime; // 마지막 크롤 시간, 업데이트 시에는 크롤한 시간으로 대채

    @OrderBy("id desc")
    @OneToMany
    private List<CrawlHistory> histories = new ArrayList<>();

    /* example
        private void test() {
            CronSequenceGenerator cronSequenceGenerator = new CronSequenceGenerator("");
            Date next = cronSequenceGenerator.next(new Date());
            LocalDateTime localDateTime = next.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        }
     */
}
