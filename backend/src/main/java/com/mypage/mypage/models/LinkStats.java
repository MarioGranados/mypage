package com.mypage.mypage.models;

import javax.persistence.*;

@Entity
@Table(name="link_stats")
public class LinkStats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private long views;

    @Column
    private long clicks;

}
