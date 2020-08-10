package com.vinnik.servlet;

//import com.thoughtworks.xstream.XStream;
//import com.thoughtworks.xstream.io.xml.DomDriver;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Servlet extends HttpServlet {
//    XStream x = new XStream(new DomDriver());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (ServletOutputStream servletOutputStream = resp.getOutputStream()) {
            servletOutputStream.print("Hello GET");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (ServletOutputStream servletOutputStream = resp.getOutputStream()) {
            servletOutputStream.print("Hello POST");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}