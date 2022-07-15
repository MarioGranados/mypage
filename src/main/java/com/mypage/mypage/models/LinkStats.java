package com.mypage.mypage.models;

import javax.persistence.*;

@Entity
@Table(name="Link_Stats")
public class LinkStats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private long views;

    @Column
    private long clicks;

}
