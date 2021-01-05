package com.example.javabbs.dao.impl;

import com.example.javabbs.dao.PostDao;
import com.example.javabbs.domain.Post;
import com.example.javabbs.domain.User;
import com.example.javabbs.util.BaseDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PostDaoImpl extends BaseDao implements PostDao {
    @Override
    public List<Post> findPostAll() {
        List<Post> list=new ArrayList<>();
        String sql="select p.*,u.u_id,u.u_name,u.u_post_count,u.u_comment_count from post p inner  join users u on p.u_id = u.u_id";
       ResultSet rs=executeQuery(sql);
       if(rs!=null){
           try {
               while (rs.next()) {
                    list.add(new Post(
                            rs.getInt(1),
                            rs.getInt(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getTimestamp(5),
                            new User(rs.getInt(6),
                                    rs.getString(7),
                                    rs.getInt(8),
                                rs.getInt(9))
                   ));
               }
           } catch (SQLException throwables) {
               throwables.printStackTrace();
           }
       }
            return list;

    }

    @Override
    public Post findByTitle(String title) {
        return null;
    }
}
