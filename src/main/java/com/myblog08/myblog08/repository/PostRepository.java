package com.myblog08.myblog08.repository;

import com.myblog08.myblog08.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
