package com.xworkz.sendInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/sent",loadOnStartup = 1)
public class TvCableRecharge extends HttpServlet {

    public TvCableRecharge(){
        System.out.println("no arg constructor from TvCableRecharge");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running service method in TvCableRecharge");
        String customer = req.getParameter("customer");
        String vendor = req.getParameter("vendor");
        String amount = req.getParameter("amount");
        String type = req.getParameter("type");

        System.out.println(customer + " " + vendor + " " + amount + " " + type);

        long amountConv = Long.parseLong(amount);


            resp.setContentType("text/html");
            PrintWriter writer = resp.getWriter();
            writer.println("<html><head><title>TvCable Recharge</title>");
            writer.println(" <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n" +
                    "<!--    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>-->\n" +
                    "\n" +
                    "    <script src=\"./tv.js\"></script>\n" +
                    "</head>");
            writer.println("<body class=\"bg-secondary\">\n" +
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
                    "            </ul>\n" +
                    "        </div>\n" +
                    "    </div>\n" +
                    "</nav>");
            writer.write("<div class=\"container mb-5 mt-5\"><div class=\"container\">" +
                    "<h1 class=\"text-white\">You Tv Recharge Total Amount is : " + amountConv +
                    "<h2 class=\"text-white\"></h2>   </div></div>");


        }
    }

