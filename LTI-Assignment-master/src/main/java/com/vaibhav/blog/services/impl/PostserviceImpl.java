package com.vaibhav.blog.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.vaibhav.blog.entities.Category;
import com.vaibhav.blog.entities.Post;
import com.vaibhav.blog.entities.User;
import com.vaibhav.blog.exceptions.ResourceNotFoundException;
import com.vaibhav.blog.payloads.CategoryDto;
import com.vaibhav.blog.payloads.PostDto;
import com.vaibhav.blog.payloads.UserDto;
import com.vaibhav.blog.repositories.CategoryRepo;
import com.vaibhav.blog.repositories.PostRepo;
import com.vaibhav.blog.repositories.UserRepo;
import com.vaibhav.blog.services.PostService;

@Service
public class PostserviceImpl implements PostService {

	@Autowired
	private PostRepo postRepo;

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private CategoryRepo categoryRepo;

	@Override
	public PostDto createPost(PostDto postDto, Integer userId, Integer categorId) {

		User findUser = this.userRepo.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
		Category findCategory = this.categoryRepo.findById(categorId)
				.orElseThrow(() -> new ResourceNotFoundException("category", "id", categorId));

		Post post = this.modelMapper.map(postDto, Post.class);
		post.setImageName("blog_image.jpg");
		post.setPostDate(new Date());
		post.setUser(findUser);
		post.setCategory(findCategory);

		Post newPost = this.postRepo.save(post);

		return this.modelMapper.map(newPost, PostDto.class);
	}

	@Override
	public PostDto updatePost(PostDto postDto, Integer postId) {
		
		 Post findPost1 = this.postRepo.findById(postId)
				  .orElseThrow(() -> new ResourceNotFoundException("post", "post id", postId));
		 
		 findPost1.setTitle(postDto.getTitle());
		 findPost1.setContent(postDto.getContent());
		 findPost1.setImageName(postDto.getImageName());

		 Post updatedPost = this.postRepo.save(findPost1);
		return this.modelMapper.map(updatedPost, PostDto.class);
	}

	@Override
	public void deletePost(Integer postId) {
		  Post findPost = this.postRepo.findById(postId)
				  .orElseThrow(() -> new ResourceNotFoundException("post", "post id", postId));
		  
		  this.postRepo.delete(findPost);

	}

	@Override
	public List<PostDto> getAllPost(Integer pageNumber,Integer pageSize) {
		
		
		
		Pageable pge = PageRequest.of(pageNumber, pageSize);
		Page<Post> pagePost = this.postRepo.findAll(pge);
	    List<Post> content = pagePost.getContent();
		
	     
	      List<PostDto> posts = content.stream().map(p -> this.postToDto(p)).collect(Collectors.toList());
	      
		return posts;
	}
	
//	public List<UserDto> getAllUsers() {
//		List<User> findAllUsers = this.userRepo.findAll();
//		List<UserDto> collect = findAllUsers.stream().map(u -> this.userToDto(u)).collect(Collectors.toList());
//		return collect;
//	}

	@Override
	public PostDto getPostById(Integer postId) {
		   Post post1 = this.postRepo.findById(postId)
		   .orElseThrow(()-> new
		   ResourceNotFoundException("Post", "post id",postId));
		return this.modelMapper.map(post1,PostDto.class);
	}

	@Override
	public List<PostDto> getPostsByCategory(Integer categoryId) {
		Category cat = this.categoryRepo.findById(categoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Category", "id", categoryId));
		
		List<Post> findByCategory = this.postRepo.findByCategory(cat);
		List<PostDto> post = new ArrayList<>();
		for (Post postDto : findByCategory) {
			PostDto postDto2 = new PostDto();
			postDto2.setPostId(postDto.getPostId());
			postDto2.setTitle(postDto.getTitle());
			postDto2.setContent(postDto.getContent());
			postDto2.setImageName(postDto.getImageName());
			postDto2.setPostDate(postDto.getPostDate());

			CategoryDto catD = new CategoryDto();
			catD.setCategoryId(postDto.getCategory().getCategoryId());
			catD.setCategoryTitle(postDto.getCategory().getCategoryTitle());
			catD.setCategoryDescription(postDto.getCategory().getCategoryDescription());

			UserDto usD = new UserDto();
			usD.setId(postDto.getUser().getId());
			usD.setName(postDto.getUser().getName());
			usD.setPassword(postDto.getUser().getPassword());
			usD.setEmail(postDto.getUser().getEmail());
			usD.setAbout(postDto.getUser().getAbout());

			postDto2.setCategory(catD);
			postDto2.setUser(usD);

			post.add(postDto2);

		}
//		List<PostDto> collectDto = findByCategory.stream()
//				.map((post) -> this.modelMapper.map(findByCategory, PostDto.class)).collect(Collectors.toList());
		return post;
	}

	@Override
	public List<PostDto> getPostsByUser(Integer userId) {
		User user = this.userRepo.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));

		List<Post> post = this.postRepo.findByUser(user);

		List<PostDto> postDto = new ArrayList<>();
		for (Post post2 : post) {
			PostDto postDto1 = new PostDto();
			CategoryDto cat = new CategoryDto();
			UserDto udo = new UserDto();

			postDto1.setPostId(post2.getPostId());
			postDto1.setTitle(post2.getTitle());
			postDto1.setContent(post2.getContent());
			postDto1.setImageName(post2.getImageName());
			postDto1.setPostDate(post2.getPostDate());
			cat.setCategoryId(post2.getCategory().getCategoryId());
			cat.setCategoryTitle(post2.getCategory().getCategoryTitle());
			cat.setCategoryDescription(post2.getCategory().getCategoryDescription());
			udo.setId(post2.getUser().getId());
			udo.setName(post2.getUser().getName());
			udo.setPassword(post2.getUser().getPassword());
			udo.setEmail(post2.getUser().getEmail());
			udo.setAbout(post2.getUser().getAbout());

			postDto1.setCategory(cat);
			postDto1.setUser(udo);

			postDto.add(postDto1);
		}
//		     List<PostDto> postDto = post.stream().map((p) -> 
//		     this.modelMapper.map(post, PostDto.class)).collect(Collectors.toList());
		return postDto;
	}

	@Override
	public List<Post> searchPosts(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Post dtoToUser(PostDto postDto) {
		Post post = this.modelMapper.map(postDto, Post.class);
//		user.setId(userDto.getId());
//		user.setName(userDto.getName());
//		user.setEmail(userDto.getEmail());
//		user.setPassword(userDto.getPassword());
//		user.setAbout(userDto.getAbout());
		return post;

	}

	public PostDto postToDto(Post post) {
		PostDto postDto =this.modelMapper.map(post,PostDto.class);
//		userDto.setId(user.getId());
//		userDto.setName(user.getName());
//		userDto.setEmail(user.getEmail());
//		userDto.setPassword(user.getPassword());
//		userDto.setAbout(user.getAbout());
		return postDto;

	}

}
