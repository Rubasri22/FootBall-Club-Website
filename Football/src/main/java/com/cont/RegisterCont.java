package com.cont;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.User;

@WebServlet("/RegisterCont")
public class RegisterCont extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name").trim();
        String age = request.getParameter("age").trim();
        String gender = request.getParameter("gender").trim();
        String address = request.getParameter("address").trim();
        
        ArrayList<String> list = new ArrayList<String>();
        
        if (name.length() == 0) {
            list.add("Enter name field!!!");
        }
        if (age.length() == 0) {
            list.add("Enter the age!!!");
        }
        if (gender.length() == 0) {
            list.add("Enter gender!!!");
        }
        if (address.length() == 0) {
            list.add("Enter address!!!");
        }
        
        if (!list.isEmpty()) {
            request.setAttribute("errors", list);
            RequestDispatcher rd = request.getRequestDispatcher("RegistrationForm.jsp");
            rd.forward(request, response);
            return;
        }
        
        User user = new User(name, age, gender, address);
        
        // Setting attributes and session data
        request.setAttribute("data", user);
        HttpSession session = request.getSession();
        session.setAttribute("data", user);
        
        // Creating and adding the cookie to the response
        Cookie cookie = new Cookie("myck", name);
        response.addCookie(cookie);
        
        // Forwarding to the success page
        RequestDispatcher rd1 = request.getRequestDispatcher("Success.jsp");
        rd1.forward(request, response);
    }
}
