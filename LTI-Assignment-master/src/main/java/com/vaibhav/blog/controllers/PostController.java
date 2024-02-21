package com.vaibhav.blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhav.blog.payloads.PostDto;
import com.vaibhav.blog.services.PostService;

@RestController
@RequestMapping("/api")
public class PostController {

	@Autowired
	private PostService postService;

	// create a post for particular user in particular category
	@PostMapping("/user/{userId}/category/{categoryId}/post")
	public ResponseEntity<PostDto> createpost(@RequestBody PostDto postDto, @PathVariable Integer userId,
			@PathVariable Integer categoryId) {

		PostDto createdPost = this.postService.createPost(postDto, userId, categoryId);

		return new ResponseEntity<PostDto>(createdPost, HttpStatus.CREATED);

	}
     //get Posts By User
	@GetMapping("/user/{userId}/posts")
	public ResponseEntity<List<PostDto>> getPostsByUser(@PathVariable Integer userId) {
		List<PostDto> post = this.postService.getPostsByUser(userId);
		return new ResponseEntity<List<PostDto>>(post, HttpStatus.OK);

	}
	//get Posts By category
	@GetMapping("/category/{categoryId}/posts")
	public ResponseEntity<List<PostDto>> getPostsBycategory(@PathVariable Integer categoryId) {
		List<PostDto> post = this.postService.getPostsByCategory(categoryId);
		return new ResponseEntity<List<PostDto>>(post, HttpStatus.OK);

	}
	
	// get all posts
	
	@GetMapping("/getAllPosts")
	public ResponseEntity<List<PostDto>> getAllPost(
			@RequestParam(value = "pageNumber", defaultValue = "0",required = false)Integer pageNumber,
			@RequestParam(value = "pageSize" , defaultValue = "3",required = false) Integer pageSize
	)
	{
		    List<PostDto> allPost = this.postService.getAllPost(pageNumber, pageSize);
		    return new ResponseEntity<List<PostDto>>(allPost,HttpStatus.OK);
//		return ResponseEntity.ok(this.postService.getAllPost(pageNumber, pageSize));
    
	}
	
	//get posts details by id
	
	@GetMapping("/posts/{postId}")
	public ResponseEntity<PostDto> getPostsById (@PathVariable Integer postId)
	{
//		  PostDto postById = this.postService.getPostById(postId);
//		  return new ResponseEntity<PostDto>(postById,HttpStatus.OK);
		  
		  return ResponseEntity.ok(this.postService.getPostById(postId));
		
	}
	
	//delete post by id
	@DeleteMapping("/deletePost/{postId}")
	public ResponseEntity<String> deletePostById(@PathVariable Integer postId)
	{
		this.postService.deletePost(postId);
		
		return new ResponseEntity<String>("Post Deleted Successfully",HttpStatus.OK);
		
	}
	//Update the Post
	
	@PutMapping("/updatePost/{postId}")
	public ResponseEntity<PostDto> postUpdate(@RequestBody PostDto dto,@PathVariable Integer postId)
	{
		PostDto updatePost = this.postService.updatePost(dto, postId);
		
		return new ResponseEntity<PostDto>(updatePost,HttpStatus.OK);
	}

}
