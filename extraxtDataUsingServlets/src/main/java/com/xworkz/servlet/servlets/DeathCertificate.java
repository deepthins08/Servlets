package com.xworkz.servlet.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/deadPerson",loadOnStartup = 1)
public class DeathCertificate extends HttpServlet {

    public DeathCertificate(){
        System.out.println("no arg constructor from DeathCertificate");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Death Certificate Details");

       String name= req.getParameter("name");
        String age= req.getParameter("age");
        String date= req.getParameter("date");
        String time= req.getParameter("time");
        String gender= req.getParameter("gender");
        String status= req.getParameter("status");
        String place= req.getParameter("place");
        String cause= req.getParameter("cause");
        String father= req.getParameter("father");
        String mother= req.getParameter("mother");
        String adhar= req.getParameter("adhar");
        String informant= req.getParameter("informant");
        String mobile= req.getParameter("mobile");
        String address= req.getParameter("address");
        String relation= req.getParameter("relation");

        System.out.println(name+" "+age+" "+date+" "+time+" "+gender+" "+status+" "+place+" "+
                cause+" "+father+" "+mother+" "+adhar+" "+informant+" "+mobile+" "+address+" "+relation);

        resp.setContentType("text/plain");
        PrintWriter writer=resp.getWriter();
        writer.write("Applied successfully ");
    }
}
