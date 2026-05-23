package com.example.servlet.servlets.mvc;

import java.io.IOException;

import com.example.servlet.models.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    
    @Override
    protected void doPost(
        HttpServletRequest request,
        HttpServletResponse response)
        throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");

        User user = new User(name, email);

        request.setAttribute("user", user);

        request.getRequestDispatcher(
            "/examples/mvc/sucess.jsp")
            .forward(request, response);
    }
}