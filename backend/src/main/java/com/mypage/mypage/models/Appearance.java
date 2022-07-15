package com.mypage.mypage.models;

import javax.persistence.*;

@Entity
@Table(name = "appearance")
public class Appearance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String color;
}
