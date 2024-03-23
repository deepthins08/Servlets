package com.xworkz.sendInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/send",loadOnStartup = 1)
public class ComputerParts extends HttpServlet {

    public ComputerParts(){
        System.out.println("no arg constructor");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running service method in service");
        String brand=req.getParameter("brand");
        String model=req.getParameter("model");
        String color=req.getParameter("color");
        String type=req.getParameter("type");
        String disk=req.getParameter("disk");
        String processor=req.getParameter("processor");
        String generation=req.getParameter("generation");
        String motherBoard=req.getParameter("motherBoard");
        String cache=req.getParameter("cache");
        String cost=req.getParameter("cost");
        String quantity=req.getParameter("quantity");

        System.out.println(brand+" "+model+" "+color+" "+type+" "+disk+" "+processor+" "+generation+" "+
                motherBoard+" "+cache+" "+cost+" "+quantity);

        resp.setContentType("text/html");

        PrintWriter writer=resp.getWriter();


        long convCost=Long.parseLong(cost);
        int convQuantity=Integer.parseInt(quantity);

        System.out.println(brand+" "+model+" "+color+" "+type+" "+disk+" "+processor+" "+generation+" "+
                motherBoard+" "+cache+" "+convCost+" "+convQuantity);


        double doubleQuantity=Double.valueOf(convQuantity);


        writer.println("<html><head><title>Computer Parts</title> <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n" +
                "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\n" +
                "</head>");
        writer.println("<body class=\"bg-secondary\">\n" +
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
                "                    <a class=\"nav-link active text-white fs-3\" href=\"./index.html\">Home</a>\n" +
                "                </li>\n" +
                "\n" +
                "                <li class=\"nav-item\">\n" +
                "                    <a class=\"nav-link active text-white fs-3\" href=\"./ComputerPart.html\">ComputerParts</a>\n" +
                "                </li>\n" +
                "            </ul>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</nav>\n" +
                "\n" +
                "<div class=\"container mb-5 mt-5\">\n" +
                "    <div class=\"container\">\n" +
                "        <h1 class=\"text-white\">Total cost of the Computer Part's is: "+doubleQuantity*convCost+" </h1>\n" +
                " <h2 class=\"text-white\"></h2>   </div>\n" +
                "</div>\n" +
                "\n" +
                "</body>\n" +
                "</html>");

    }
}
