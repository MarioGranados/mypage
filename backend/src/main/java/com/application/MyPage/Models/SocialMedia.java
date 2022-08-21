package com.application.MyPage.Models;

import javax.persistence.*;

@Entity
@Table(name = "social_media")
public class SocialMedia {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String url;
    @Column
    private String logo;

    @OneToOne
    private User user;

    public SocialMedia() {
    }

    public SocialMedia(Long id, String name, String url, String logo, User user) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.logo = logo;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
