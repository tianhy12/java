package com.example.javabbs.service.impl;

import com.example.javabbs.dao.PostDao;
import com.example.javabbs.dao.impl.PostDaoImpl;
import com.example.javabbs.domain.Post;
import com.example.javabbs.service.FindPostAllService;

import java.util.List;

public class FindPostAllServiceImpl implements FindPostAllService {
    PostDao postDao=new PostDaoImpl();
    @Override
    public List<Post> selectPostAll() {
        return postDao.findPostAll();
    }
}
