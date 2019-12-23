package com.faq.trv.entities;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="topic")
public class Topic {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private long topidId;

    @Column(name = "topic")
    private String topic;

    @Column(name = "question_one")
    private String q1;

    @Column(name = "q1a")
    private String q1a;
    @Column(name = "q1b")
    private String q1b;
    @Column(name = "q1c")
    private String q1c;
    @Column(name = "q1d")
    private String q1d;

    @Column(name = "date_created")
    @CreatedDate
    private Date dateCreated;
}
