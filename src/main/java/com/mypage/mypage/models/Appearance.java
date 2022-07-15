package com.mypage.mypage.models;

import javax.persistence.*;

@Entity
@Table(name = "Appearance")
public class Appearance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String color;
}
