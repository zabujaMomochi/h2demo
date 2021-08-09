package com.firstproj.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Post {

    @Id
    @GeneratedValue
    private Long id;


    private String title;
    private String body;
    private String postedOn;



    @ManyToOne
    private Author author;

    private Post() {

    }

    public Post(String title) {
        this.setTitle(title);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(String postedOn) {
        this.postedOn = postedOn;
    }

    @Override
    public String toString() {
        return "Post [title=" + title + "]";
    }
}
