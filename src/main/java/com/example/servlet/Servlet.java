package com.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//Es una anotacion o un path o una key para hacer conexion con servlet
@WebServlet("/Servlet")

public class Servlet extends HttpServlet {
    //indicamos el metodo a utilizar en el servlet
    //Enviamos los DATOS mediante un LINK utilizamos el
    //METODO get si mandamos informacion por medio de botones a la red etiquetas a
    //METODO post por si mandamos iformacion pro medio de un formulario
    @Override
    protected void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) throws IOException, ServletException {
        //Seteo el tipo de contendido que va a devolver
        // el servidor (setContenttype): va a devolver
        //un texto html
        respuesta.setContentType("text/html");
        //Defino una varuable de tipo PrintWriter
        //para mostrar contenido en pantalla
        PrintWriter out = respuesta.getWriter();
        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.printf("<meta charset=\"utf-8\">");
        out.printf("<title> Hola mundo desde Servlet </title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Hola mundo servlet</h1>");out.print("</body>");
        out.print("</html>");


    }

}
