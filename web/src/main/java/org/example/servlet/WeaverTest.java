package org.example.servlet;

import com.example.longrange.Bird;
import com.example.remote.LocalCar;
import com.example.remote.RemoteCar;

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

    @EJB(beanName = "bmw")
    private RemoteCar car;

    @EJB
    private LocalCar localCar;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = null;

        try {
            writer = resp.getWriter();
            resp.setContentType("text/plain");
            String name = bird.getBird();
            String remoteCar = car.getRemoteCar();
            String lcar = localCar.getLocalCar();
            writer.println(name);
            writer.println(remoteCar);
            writer.println(lcar);

        } catch (Exception e) {
            writer.println(e.getMessage());
        }
        {
            writer.close();
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
