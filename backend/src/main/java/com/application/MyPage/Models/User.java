package com.application.MyPage.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long userId;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String email;

    @Column
    private String status;

    @Column
    private String bio;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Link> links;

    public User() {

    }

    public User(User copy) {
        userId = copy.userId; // This line is SUPER important! Many things won't work if it's absent
        email = copy.email;
        username = copy.username;
        password = copy.password;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }
}
