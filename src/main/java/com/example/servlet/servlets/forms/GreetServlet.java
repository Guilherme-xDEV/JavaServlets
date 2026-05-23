package com.example.servlet.servlets.forms;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/greet")
public class GreetServlet extends HttpServlet {

    @Override
    protected void doPost(
            HttpServletRequest req,
            HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");

        if (name == null || name.isBlank()) {
            name = "Visitante";
        }

        if (email == null || email.isBlank()) {
            email = "Não informado";
        }

        String htmlResponse = """
            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="UTF-8">
                <title>Response</title>
            </head>
            <body>

                <h1>Data received successfully!</h1>

                <p>Name: %s</p>
                <p>Email: %s</p>

            </body>
            </html>
            """.formatted(name, email);

        resp.setContentType("text/html;charset=UTF-8");

        resp.getWriter().print(htmlResponse);
    }
}