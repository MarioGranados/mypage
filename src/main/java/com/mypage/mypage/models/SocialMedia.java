package com.mypage.mypage.models;

import javax.persistence.*;

@Entity
@Table(name = "Social_Media")
public class SocialMedia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long socialId;

    @Column
    private String social;

    @Column
    private String url;

}
