package com.mypage.mypage.models;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UserId;

    @Column(nullable = false)
    private String userName;

    @Column
    private String avatarImg;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String bio;

    @Column
    private String header;

    @Column
    private String video;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Link> links;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<SocialMedia> socialMedia;

}
