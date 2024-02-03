
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

import Dao.daoClass;
import Dao.pojoUser;

public class register extends HttpServlet {
    
    daoClass dao = new daoClass();
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        
        pojoUser user = new pojoUser();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        
        if(dao.addUser(user)== 1){
            res.sendRedirect("index.html");
        }
        else{
            res.sendRedirect("register.jsp");
        }
        
        
        
    }
}
