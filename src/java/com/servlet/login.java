package com.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

import Dao.daoClass;

public class login extends HttpServlet{
      daoClass dao = new daoClass();
    
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
      
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        
        
        if(dao.isValid(email, password)== 1){
            HttpSession session = req.getSession();
            session.setAttribute("email",email);
            
            
            res.sendRedirect("welcome.jsp");
            
            
            
            
        }
        else{
            //out.println("<h3> Invalid login details </h3>");
            RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
            rd.include(req, res);
//            res.sendRedirect("login.jsp");
        }
        
        
    }
}
