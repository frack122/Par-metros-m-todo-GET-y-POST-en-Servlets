package com.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletParametros")
public class ParametrosGetServlet extends HttpServlet {


protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
    //Recibiento de los Parametros
    String Nombre = req.getParameter("Nombre");
    String Apellido = req.getParameter("Apellido");
    String programacion = req.getParameter("pro");
    String Descripcion = req.getParameter("Descripcion");
    String Genero = req.getParameter("Genero");

    // Manejo de la conversión de Edad a entero
    int Edad = 0;
    try {
        Edad = Integer.parseInt(req.getParameter("Edad"));
    } catch (NumberFormatException e) {
        // En caso de que no se pueda convertir la edad, se asigna un valor predeterminado o se maneja el error según sea necesario
        // Por ejemplo, podrías imprimir un mensaje de error o asignar un valor predeterminado.
        // Aquí, simplemente asignaremos 0 como valor predeterminado.
        Edad = 0;
    }
    response(resp,Nombre, Apellido, Edad, programacion, Descripcion, Genero);

}
    protected void response( HttpServletResponse resp,String Nombre,String Apellido,int Edad,String programacion,String Descripcion,String Genero) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        // Envío de la respuesta al cliente
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Resultado del Formulario</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; background-color: #f4f4f4; }");
        out.println(".container { max-width: 600px; margin: 50px auto; background-color: #fff; border-radius: 8px; padding: 20px; box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1); }");
        out.println("h2, p { color: #333; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h2>Nombre: " + Nombre + "</h2>");
        out.println("<h2>Apellido: " + Apellido + "</h2>");
        out.println("<h2>Edad: " + Edad + "</h2>");
        out.println("<h2>Su Genero : " + Genero + "</h2>");
        out.println("<h2>Su lenguaje de programación elegido es: " + programacion + "</h2>");
        out.println("<p>Descripción suya es: " + Descripcion + "</p>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }

}
