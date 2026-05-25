package com.example.servlet.servlets.mvc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.example.servlet.models.Task;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/tasks")
public class TaskServlet extends HttpServlet {
    
    @Override protected void doPost(
        HttpServletRequest request,
        HttpServletResponse response)
        throws ServletException, IOException {

        String title = request.getParameter("title");
        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task(title, false));
        tasks.add(new Task("Study Servlets", true));
        tasks.add(new Task("Learn JSP", true));
        tasks.add(new Task("Understand JSTL", false));

        request.setAttribute("tasks", tasks);

        request.getRequestDispatcher(
            "/examples/mvc/tasks.jsp")
            .forward(request, response);
    }
}