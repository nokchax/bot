package com.nokchax.bot.endpoint.crawl.domain;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class NotificationTarget {
    // 알람을 받을 대상에 대한 정보를 담고 있음
    // alaram type (mail, phone, messenger)
}
