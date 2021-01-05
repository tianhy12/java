package com.example.javabbs.util;

import java.sql.*;

public class BaseDao {
    private static Connection  connection;
    private static PreparedStatement preparedStatement;
    private static String username="make";
    private static String password="Ma1234..";


    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/test",username,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public static Connection getConnection(){
        if(connection==null) {
            try {
                return DriverManager.getConnection("jdbc:mysql://localhost:3306/test",username,password);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return connection;
    }

    public ResultSet executeQuery(String sql,Object...prams){
        getConnection();
        try {
            preparedStatement=connection.prepareStatement(sql);
            for(int i=0;i<prams.length;i++){
                preparedStatement.setObject(i+1,prams[i]);
            }
            return  preparedStatement.executeQuery();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }


    public int executeUpdate(String sql,Object...prams){
        getConnection();
        try {
            preparedStatement=connection.prepareStatement(sql);
            for(int i=0;i<prams.length;i++){
                preparedStatement.setObject(i+1,prams[i]);
            }
            return  preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return -1;
    }

}
