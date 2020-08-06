package com.nokchax.bot.endpoint.crawl.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

    @Scheduled(cron = "0 0/1 * * *")
    public void scheduling() {
        /* todo
             1. fetch all target crawl unit that time match
             2. crawl each unit
             3. log history
             4. update crawl unit
             5. alarm result
         */
    }
}
