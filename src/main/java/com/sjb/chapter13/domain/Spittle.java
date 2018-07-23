package com.sjb.chapter13.domain;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Spittle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "spitter")
    private final Spitter spitter;

    @Column
    private final String message;

    @Column
    private final Date postedTime;

    public Spittle(Long id, Spitter spitter, String message, Date postedTime) {
        this.id = id;
        this.spitter = spitter;
        this.message = message;
        this.postedTime = postedTime;
    }

    public Long getId() {
        return this.id;
    }

    public String getMessage() {
        return this.message;
    }

    public Date getPostedTime() {
        return this.postedTime;
    }

    public Spitter getSpitter() {
        return this.spitter;
    }

}