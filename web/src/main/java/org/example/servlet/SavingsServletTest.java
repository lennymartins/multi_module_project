package org.example.servlet;

import com.example.Account;
import com.example.SavingsAccount;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SavingsServletTest extends HttpServlet {

   @EJB(beanName = "svn")
   private Account account;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = null;

        try{
            writer = resp.getWriter();
            resp.setContentType("text/plain");
            String message = account.getString();
            writer.println(message);
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
