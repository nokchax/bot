package com.nokchax.bot.endpoint.crawl.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@DiscriminatorColumn(columnDefinition = "type")
@Inheritance(strategy = InheritanceType.JOINED)
public class NotificationTarget {
    // 알람을 받을 대상에 대한 정보를 담고 있음
    // alarm media 에 따라 필요한 정보가 달라지므로 NotificationTarget 테이블을 상속하여 매체에 따라 다른 테이블을 사용하는 방식을 사용할 것
    @Id
    private int id;
    private AlarmMedia alarmMedia;
}
