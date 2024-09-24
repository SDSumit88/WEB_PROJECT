package com.kodbook.services;

import java.util.List;

import com.kodbook.entities.Post;

public interface PostService {

	public void createPost(Post post);
	List<Post> getAllPosts();// VIEW POST AFTER CREATION
	List<Post> fetchAllPosts();// this will fetch allpost to newsfeed 
}
