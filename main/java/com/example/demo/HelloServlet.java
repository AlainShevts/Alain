package com.example.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;

    public class HelloServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
//параметры запроса
        String name = request.getParameter("name");
        String email = request.getParameter("email");

// Создаем экземпляр класса
        FormProcessor formProcessor = new FormProcessor();

// Обрабатываем запрос
        String result = formProcessor.processForm(name, email);

//ответ
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Form Submit Result:</h1>");
        out.print(result);
        out.println("</body></html>");
    }
}