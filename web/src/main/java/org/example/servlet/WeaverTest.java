package org.example.servlet;

import com.example.longrange.Bird;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WeaverTest extends HttpServlet {

    @EJB(beanName = "brd")
    private Bird bird;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = null;

        try{
            writer = resp.getWriter();
            resp.setContentType("text/plain");
            String name = bird.getBird();
            writer.println(name);

        }catch (Exception e){
            writer.println(e.getMessage());
        }{
            writer.close();
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
