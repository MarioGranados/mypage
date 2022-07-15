package com.mypage.mypage.models;

import javax.persistence.*;

@Entity
@Table(name="links")
public class Link {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long linkId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String url;

    @Column(nullable = false)
    private String content;

    @Column
    private String thumbnail;

    @Column(nullable = false)
    private boolean active;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
}
