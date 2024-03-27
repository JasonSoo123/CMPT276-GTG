package com.gtg.gtg.models;

import jakarta.persistence.*;

@Entity
@Table(name="Post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;

    private String title;
    private String categoryType; 
    private String content;

    public Post() {
    }

    public Post(int uid, String title, String categoryType, String content) {
        this.uid = uid;
        this.title = title;
        this.categoryType = categoryType;
        this.content = content;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }  
}
