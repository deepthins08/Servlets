package com.xworkz.javaServerPage.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/degree",loadOnStartup = 1)
public class DegreeResult extends HttpServlet {

    public DegreeResult(){
        System.out.println("no arg constructor from DegreeResult");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running service in DegreeResult");
        String name=req.getParameter("cname");
        String mail=req.getParameter("mail");
        String college=req.getParameter("college");
        String deg=req.getParameter("deg");
        String stream=req.getParameter("stream");
        String branch=req.getParameter("branch");
        String percentage=req.getParameter("percentage");

        System.out.println(name+" "+mail+" "+college+" "+deg+" "+stream+" "+branch+" "+percentage);

        RequestDispatcher dispatcher =req.getRequestDispatcher("DegreeResult.jsp");
        req.setAttribute("nm",name);
        req.setAttribute("ml",mail);
        req.setAttribute("clg",college);
        req.setAttribute("degree",deg);
        req.setAttribute("strm",stream);
        req.setAttribute("brch",branch);
        req.setAttribute("per",percentage);

        dispatcher.forward(req,resp);

    }
}
