package com.firstproj.repository;

import com.firstproj.domain.Post;
import org.springframework.data.repository.CrudRepository;


public interface PostRepository extends CrudRepository<Post, Long> {

}
