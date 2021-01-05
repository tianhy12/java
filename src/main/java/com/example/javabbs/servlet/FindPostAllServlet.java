package com.example.javabbs.servlet;

import com.example.javabbs.domain.Post;
import com.example.javabbs.service.FindPostAllService;
import com.example.javabbs.service.impl.FindPostAllServiceImpl;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/")
public class FindPostAllServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FindPostAllService postAllService=new FindPostAllServiceImpl();
        List<Post> list=postAllService.selectPostAll();
        req.setAttribute("list",list);

        System.out.println(list);
        req.getRequestDispatcher("find.jsp").forward(req,resp);
    }
}
