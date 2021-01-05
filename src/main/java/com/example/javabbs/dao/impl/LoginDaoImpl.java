package com.example.javabbs.dao.impl;

import com.example.javabbs.dao.LoginDao;
import com.example.javabbs.domain.Login;
import com.example.javabbs.util.BaseDao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDaoImpl extends BaseDao implements LoginDao {
    @Override
    public int loginUser(Login login) {
        String sql="select u_username,l_password from login where u_username=?,l_password=?";
        ResultSet rs=executeQuery(sql,login.getuUserName(),login.getlPassword());
        try {
            while (rs.next()){
                return 1;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }
}
