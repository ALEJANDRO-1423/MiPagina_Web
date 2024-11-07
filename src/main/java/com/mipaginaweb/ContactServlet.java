package com.mipaginaweb;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/contacto")
public class ContactServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String correo = request.getParameter("correo");
        String mensaje = request.getParameter("mensaje");
       

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<h1>Gracias por tu mensaje, " + nombre + "!</h1>");
        out.println("<p>Nos pondremos en contacto contigo a través del correo: " + correo + ".</p>");
        out.println("<p>Mensaje recibido: " + mensaje + "</p>");
    }
}
