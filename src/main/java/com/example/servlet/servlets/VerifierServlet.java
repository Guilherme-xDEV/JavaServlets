package com.example.servlet.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.time.Year;

@WebServlet("/verifier")
public class VerifierServlet extends HttpServlet {
    
    @Override
    protected void doPost(
        HttpServletRequest req,
        HttpServletResponse resp)
        throws ServletException, IOException {
            
            String age = req.getParameter("age");
            String leapYear = req.getParameter("leapYear");
            String palindrome = req.getParameter("palindrome");

            if (age == null || age.isBlank()) {
                age = "0";
            }

            if (leapYear == null || leapYear.isBlank()) {
                leapYear = "0";
            }

            if (palindrome == null || palindrome.isBlank()) {
                palindrome = "";
            }


            String htmlResponse = """
                    <!DOCTYPE html>
                    <html>
                    <head>
                        <meta charset="UTF-8">
                        <title>Verificator</title>
                    </head>
                    <body>

                        <h1>Validation of the Received data:</h1>

                        <p>Is adult? %s</p>
                        <p>Is a leap year? %s</p>
                        <p>Is Palindrome? %s</p>

                    </body>
                    </html>
                        
                    """.formatted(verifyAge(age), verifyYearLeap(leapYear), isPalindrome(palindrome));

            resp.setContentType("text/html;charset=UTF-8");

            resp.getWriter().print(htmlResponse);
        }

    static String verifyAge(String age) {

        Integer intAge = Integer.parseInt(age);
        String response = "Not of this world..";

        if (intAge <= 17 && intAge >= 0) {
            response = "You're not an adult";
            return response;

        } else if (intAge >= 18) {
            response = "You're an adult!";
            return response;
        }
        return response;

    }

    static String verifyYearLeap(String getYear) {

        Integer yearInt = Integer.parseInt(getYear);
        Year yearAsInteger = Year.of(yearInt);

        String response = "The year is not leap!";
        if (yearAsInteger.isLeap()) {
            response = "The year is Leap!";
            return response;
        }
        return response;
    }

    static String isPalindrome(String word) {

        String response = "not a palindrome";

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            char charLeft = Character.toLowerCase(word.charAt(left));
            char charRight = Character.toLowerCase(word.charAt(right));

            if (charLeft != charRight) {
                return response;
            }
            left++;
            right--;
        }

        response = "it is a palindrommeeee!";
        return response;

    }
}