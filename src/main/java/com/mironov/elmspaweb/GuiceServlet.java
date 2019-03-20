package com.mironov.elmspaweb;



import com.google.inject.Singleton;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Singleton
public class GuiceServlet extends HttpServlet {

    public GuiceServlet(){ }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){

    }



}
