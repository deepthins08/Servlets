package com.xworkz.javaServerPage.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/market",loadOnStartup = 2)
public class MarketResult extends HttpServlet {

    public MarketResult(){
        System.out.println("no arg constructor from MarketResult");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running service in MarketResult");

        String name= req.getParameter("cname");
        String location= req.getParameter("location");
        String city= req.getParameter("city");
        String pincode= req.getParameter("pincode");
        String area= req.getParameter("area");
        String type= req.getParameter("type");
        String stall= req.getParameter("stall");
        String itemName= req.getParameter("itemName");
        String itemQuality= req.getParameter("itemQuality");
        String itemQuantity= req.getParameter("itemQuantity");
        String itemCost= req.getParameter("itemCost");
        String stallOwner= req.getParameter("stallOwner");
        String keb= req.getParameter("keb");
        String gst= req.getParameter("gst");
        String transaction= req.getParameter("transaction");

        System.out.println(name+" "+location+" "+city+" "+pincode+" "+area+" "+type+" "+stall+" "+itemName+" "+
                itemQuality+" "+itemQuantity+" "+itemCost+" "+stallOwner+" "+keb+" "+gst+" "+transaction);

        RequestDispatcher dispatcher =req.getRequestDispatcher("MarketResult.jsp");
        req.setAttribute("name",name);
        req.setAttribute("location",location);
        req.setAttribute("city",city);
        req.setAttribute("pincode",pincode);
        req.setAttribute("area",area);
        req.setAttribute("type",type);
        req.setAttribute("stall",stall);
        req.setAttribute("itemName",itemName);
        req.setAttribute("itemQuality",itemQuality);
        req.setAttribute("itemQuantity",itemQuantity);
        req.setAttribute("itemCost",itemCost);
        req.setAttribute("stallOwner",stallOwner);
        req.setAttribute("keb",keb);
        req.setAttribute("gst",gst);
        req.setAttribute("transaction",transaction);

        dispatcher.forward(req,resp);
    }
}
