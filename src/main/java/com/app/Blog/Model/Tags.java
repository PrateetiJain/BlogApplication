package com.app.Blog.Model;

import javax.persistence.*;

@Entity
@Table(name = "tags")
public class Tags {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long tagId;

    @Column(name = "tag_name")
    private String tagName;

    @Column(name = "created_at")
    private String tagCreatedAt;

    public long getTagId() {
        return tagId;
    }

    public void setTagId(long tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagCreatedAt() {
        return tagCreatedAt;
    }

    public void setTagCreatedAt(String tagCreatedAt) {
        this.tagCreatedAt = tagCreatedAt;
    }
}
