package com.myblog08.myblog08.service;

import com.myblog08.myblog08.payload.PostDto;

public interface PostService{

    PostDto createPost(PostDto postDto);

    PostDto getPostById(long id);
}
