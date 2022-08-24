package com.application.MyPage.Models;

import javax.persistence.*;

@Entity
@Table(name = "Settings")
public class UserSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String bgColor;

    @Column
    private String linkColor;

    @Column
    private boolean darkMode;

    @Column
    private String fontStyle;

    @OneToOne
    User user;

    public UserSettings() {

    }

    public UserSettings(Long id, String bgColor, String linkColor, boolean darkMode, String fontStyle, User user) {
        this.id = id;
        this.bgColor = bgColor;
        this.linkColor = linkColor;
        this.darkMode = darkMode;
        this.fontStyle = fontStyle;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public String getLinkColor() {
        return linkColor;
    }

    public void setLinkColor(String linkColor) {
        this.linkColor = linkColor;
    }

    public boolean isDarkMode() {
        return darkMode;
    }

    public void setDarkMode(boolean darkMode) {
        this.darkMode = darkMode;
    }

    public String getFontStyle() {
        return fontStyle;
    }

    public void setFontStyle(String fontStyle) {
        this.fontStyle = fontStyle;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
