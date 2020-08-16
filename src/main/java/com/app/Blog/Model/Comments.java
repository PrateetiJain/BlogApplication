package com.app.Blog.Model;

import javax.persistence.*;

@Entity
@Table(name = "Comments")
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long commentId;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "comment")
    private String comment;

    @Column(name = "post_id")
    private long postId;

    @Column(name = "created_at")
    private String commentCreatedAt;

    @Column(name = "updated_at")
    private String commentUpdatedAt;

    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getCommentCreatedAt() {
        return commentCreatedAt;
    }

    public void setCommentCreatedAt(String commentCreatedAt) {
        this.commentCreatedAt = commentCreatedAt;
    }

    public String getCommentUpdatedAt() {
        return commentUpdatedAt;
    }

    public void setCommentUpdatedAt(String commentUpdatedAt) {
        this.commentUpdatedAt = commentUpdatedAt;
    }
}
