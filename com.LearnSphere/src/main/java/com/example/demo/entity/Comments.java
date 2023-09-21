package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comments {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int commentId;
	String comment;
	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comments(int commentId, String comment) {
		super();
		this.commentId = commentId;
		this.comment = comment;
	}
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
