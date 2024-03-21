package com.xworkz.servlet.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;
@WebServlet(urlPatterns = "/gym",loadOnStartup = 2)
public class Gym extends HttpServlet {

    public Gym(){
        System.out.println("no arg constructor from Gym");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("User Details");
        String name=req.getParameter("name");
        String date=req.getParameter("date");
        String mail=req.getParameter("mail");
        String mobile=req.getParameter("mobile");
        String city=req.getParameter("city");
        String disability=req.getParameter("disability");

        System.out.println(name+" "+date+" "+mail+" "+mobile+" "+city+" "+disability);

        resp.setContentType("text/plain");
        PrintWriter writer=resp.getWriter();
        writer.write("Application submitted successfully");
    }
}
