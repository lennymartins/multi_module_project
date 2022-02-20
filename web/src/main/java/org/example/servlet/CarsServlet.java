package org.example.servlet;

import com.example.remote.CarImpl;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CarsServlet extends HttpServlet {

    @EJB(beanName = "cars")
    private CarImpl car;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = null;
        try{
            writer = resp.getWriter();
            resp.setContentType("text/plain");
            String message = car.getLocalCar();
            writer.println(message);

        }catch (Exception e){
            writer.println(e.getMessage());
        }finally {
            writer.close();
        }

    }
}
