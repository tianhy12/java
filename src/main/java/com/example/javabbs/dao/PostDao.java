package com.example.javabbs.dao;

import com.example.javabbs.domain.Post;

import java.util.List;

public interface PostDao {

    List<Post> findPostAll();

    Post findByTitle(String title);
}
