package com.xworkz.sendInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/bookMovie",loadOnStartup = 4)
public class MovieTicketsBooking extends HttpServlet {


    public MovieTicketsBooking(){

        System.out.println("no arg constructor from MovieTicketBooking");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running service from");

        String name=req.getParameter("cname");
        String mobile=req.getParameter("mobile");
        String movie=req.getParameter("movie");
        String seat=req.getParameter("seat");
        String cost=req.getParameter("cost");
        String check=req.getParameter("check");

        System.out.println(name+" "+mobile+" "+movie+" "+seat+" "+cost+" "+check);

        PrintWriter writer=resp.getWriter();
        writer.write("<html><head><title>Book Movie Ticket</title>");
        writer.write(" <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n" +
                "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\n" +
                "    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\n" +
                "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>\n" +
                "    <script src=\"./movie.js\"></script>\n" +
                "</head>");
        writer.write("<body class=\"bg-secondary\">\n" +
                "\n" +
                "<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n" +
                "    <div class=\"container\">\n" +
                "\n" +
                "        <a class=\"navbar-brand\" href=\"#\"></a>\n" +
                "\n" +
                "        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
                "            <span class=\"navbar-toggler-icon\"></span>\n" +
                "        </button>\n" +
                "\n" +
                "        <div  id=\"navbarNav\">\n" +
                "            <ul class=\"navbar-nav\">\n" +
                "                <li class=\"nav-item\">\n" +
                "                    <a class=\"nav-link active text-white fs-3 \" href=\"./index.html\">Home</a>\n" +
                "                </li>\n" +
                "\n" +
                "                <li class=\"nav-item\">\n" +
                "                    <a class=\"nav-link active text-white fs-3\" href=\"./ComputerPart.html\">ComputerParts</a>\n" +
                "                </li>\n" +
                "                <li class=\"nav-item\">\n" +
                "                    <a class=\"nav-link active text-white fs-3\" href=\"./TvRecharge.html\">TvRecharge</a>\n" +
                "                </li>\n" +
                "                <li class=\"nav-item\">\n" +
                "                    <a class=\"nav-link active text-white fs-3\" href=./Fruits.html>Fruits</a>\n" +
                "                </li>\n" +

                "            </ul>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</nav>\n" +
                "\n" +
                "\n" +
                "</ul>\n" +
                "</div>\n" +
                "</div>\n" +
                "</nav>\n");

        writer.write("\n" +
                "<div class=\"container mb-5 mt-5\">\n" +
                "    <div class=\"container\">\n" +
                "        <h1 class=\"text-white\">Your Movie Ticket is Confirmed</h1>\n" +
                "    </div>\n" +
                "</div>");

   writer.write("\n" +
           "<div class=\"container mt-5 mb-5 d-flex justify-content-center\">\n" +
           "    <div class=\"card px-5 py-4 bg-dark\">\n" +
           "        <div class=\"card-body\">\n" +
           "            <h6 class=\"card-title mb-3 text-white fs-1\">Your Ticket Booking Details</h6>\n" );

   writer.write("<div class=\"container mb-5 mt-5\">\n" +
           "    <div class=\"container\">\n" +
           "        <h3 class=\"text-white\">Movie Name: "+movie +"</h3>\n" +
           "    </div>\n" +
           "</div>");
   writer.write("<div class=\"container mb-5 mt-5\">\n" +
           "    <div class=\"container\">\n" +
           "        <h3 class=\"text-white\">No of seats: "+seat+"</h3>\n" +
           "    </div>\n" +
           "</div>");
   writer.write("  </div></div></div></form></body></html>");

    }




}
