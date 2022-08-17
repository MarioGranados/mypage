package com.application.MyPage.Models;

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

    @ManyToOne
    @JoinColumn(name="user_id")
    private User User;

    public Link() {}

    public Link(Long linkId, String URL, String thumbnail, String title, String description) {
        this.linkId = linkId;
        this.URL = URL;
        this.thumbnail = thumbnail;
        this.title = title;
        this.description = description;
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

    public com.application.MyPage.Models.User getUser() {
        return User;
    }

    public void setUser(com.application.MyPage.Models.User user) {
        User = user;
    }
}
