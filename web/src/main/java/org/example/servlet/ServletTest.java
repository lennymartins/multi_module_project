package org.example.servlet;

import com.example.Account;
import com.example.PpbmAddressDetail;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ServletTest extends HttpServlet {

    @EJB(beanName = "chk")
    private Account account;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = null;
        try{
            writer = resp.getWriter();
            resp.setContentType("text/plain");
            String message = account.getString();
            List<PpbmAddressDetail> list = account.testPU();
            writer.println("ok");
            writer.println(message);
            writer.println(list);
        }catch (Exception e){
            writer.println(e.getMessage());
        }finally {
            writer.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
