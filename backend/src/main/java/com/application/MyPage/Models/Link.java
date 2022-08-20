package com.application.MyPage.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "link")
public class Link {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long linkId;

    @Column
    private String URL;

    @Column
    private String thumbnail;

    @Column
    private String title;

    @Column
    private String description;

    @OneToOne
    private User user;

    public Link() {}

    public Link(Long linkId, String URL, String thumbnail, String title, String description, User user) {
        this.linkId = linkId;
        this.URL = URL;
        this.thumbnail = thumbnail;
        this.title = title;
        this.description = description;
        this.user = user;
    }

    public Long getLinkId() {
        return linkId;
    }

    public void setLinkId(Long linkIdd) {
        this.linkId = linkId;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
