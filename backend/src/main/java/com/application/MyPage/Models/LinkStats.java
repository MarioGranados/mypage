package com.application.MyPage.Models;

import javax.persistence.*;

@Entity
@Table(name = "link_stats")
public class LinkStats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private double clicks;

    public LinkStats() {}

    public LinkStats(Long id, double clicks) {
        this.id = id;
        this.clicks = clicks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getClicks() {
        return clicks;
    }

    public void setClicks(double clicks) {
        this.clicks = clicks;
    }
}
