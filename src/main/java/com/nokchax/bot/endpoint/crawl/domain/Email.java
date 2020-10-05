package com.nokchax.bot.endpoint.crawl.domain;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@Entity
@DiscriminatorValue("email")
public class Email extends NotificationTarget {
}
