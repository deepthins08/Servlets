package com.xworkz.servlet.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;
@WebServlet(urlPatterns = "/vehicle",loadOnStartup = 3)
public class VehicleService extends HttpServlet {

    public VehicleService(){
        System.out.println("no arg constructor from VehicleService");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Service booked details");
        String name=req.getParameter("name");
        String mobile=req.getParameter("mobile");
        String mail=req.getParameter("mail");
        String address=req.getParameter("address");
        String type=req.getParameter("type");
        String model=req.getParameter("model");
        String color=req.getParameter("color");
        String reg=req.getParameter("reg");
        String year=req.getParameter("year");
        String service=req.getParameter("service");

        System.out.println(name+" "+mobile+" "+mail+" "+address+" "+type+" "+model+" "+
                color+" "+reg+" "+year+" "+service);

        resp.setContentType("text/plain");
        PrintWriter writer=resp.getWriter();
        writer.write("Successfully booked!!!!");
    }
}
