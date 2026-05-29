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
import jakarta.servlet.http.HttpSession;

@WebServlet("/tasks")
public class TaskServlet extends HttpServlet {
    
    @Override protected void doGet(
        HttpServletRequest request,
        HttpServletResponse response)
        throws ServletException, IOException {

        HttpSession session = request.getSession();

        List<Task> tasks = (List<Task>) session.getAttribute("tasks");

        if (tasks == null) {
            tasks = new ArrayList<>();

            tasks.add(new Task(1, "Study Servlets", "test1", true));
            tasks.add(new Task(2, "Learn JSP", "test2", true));
            tasks.add(new Task(3, "Understand JSTL", "Behold World", false));

            session.setAttribute("tasks", tasks);
        }

        request.setAttribute("tasks", tasks);
        request.getRequestDispatcher(
            "/examples/mvc/tasks.jsp")
            .forward(request, response);
    }

    @Override
    protected void doPost(
        HttpServletRequest request,
        HttpServletResponse response)
        throws ServletException, IOException {

        HttpSession session = request.getSession();

        List<Task> tasks = (List<Task>) session.getAttribute("tasks");
            
        if (tasks == null) {
            tasks = new ArrayList<>();
        }

        String title = request.getParameter("title");

        String description = request.getParameter("description");

        int nextId = tasks.size() + 1;

        Task task = new Task(nextId, title, description, false);

        tasks.add(task);

        session.setAttribute("tasks", tasks);

        response.sendRedirect(
            request.getContextPath() + "/tasks");
    }
}

/*
28/05

Implemented Concepts:
Session Scope, Request Persistency,
POST -> for add new task / modificate state
GET -> to list tasks

Use response.sendRedirect() instead of forward()
then it is possible: POST -> Redirect -> GET (PRG Pattern)

-> it adds 'mini' persistency without database.

general servlet flux:
Post /tasks  -->  Redirect  --> Get /tasks  --> Rendering w/ JSP
*/