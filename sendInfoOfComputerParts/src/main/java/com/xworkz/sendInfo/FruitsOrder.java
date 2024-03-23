package com.xworkz.sendInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/fruitSend",loadOnStartup = 3)
public class FruitsOrder extends HttpServlet {

    public FruitsOrder(){

        System.out.println("no arg constructor from FruitsOrder");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running service from FruitsOrder");

       String name= req.getParameter("cname");
        String number= req.getParameter("id");
        String fruits= req.getParameter("fruit");
        String quantity= req.getParameter("kg");
        String payment= req.getParameter("cost");
        String amount= req.getParameter("confirm");

        System.out.println(name+" "+number+" "+fruits+" "+quantity+" "+payment+" "+amount);

        resp.setContentType("text/html");

        PrintWriter writer=resp.getWriter();
        writer.write("<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Computer Parts</title>\n" +
                "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n" +
                "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\n" +
                "</head>");

        writer.write("<body class=\"bg-secondary\">\n" +
                "\n" +
                "\n" +
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
                "</nav>");
        writer.write("\n" +
                "<div class=\"container mb-5 mt-5\">\n" +
                "    <div class=\"container\">\n" +
                "        <h1 class=\"text-white\">Your order is confirmed!!!!</h1>\n" +
                "    </div>\n" +
                "</div>");


    }
}
