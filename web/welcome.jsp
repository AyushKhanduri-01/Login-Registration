<%--
    Document   : welcome
    Created on : 02-Feb-2024, 2:13:24 am
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "javax.servlet.http.HttpSession"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
        <style>
            body {
                margin: 0;
                padding: 0;
                font-family: Arial, sans-serif;
                background-color: #fd7e14; /* Background color for the entire page */
            }

            .container {
                text-align: center;
                margin: auto;
                margin-top: 30vh;
                padding: 20px;
                width: 70vh;
                background-color: #ffffff; /* Background color for the container */
                border-radius: 10px;
                box-shadow: 0 10px 10px rgba(0, 0, 0, 0.9); /* Adding a subtle box shadow for depth */
            }

            h1 {
                color: #333; /* Heading color */
            }
        </style>
    </head>
    <body>
        <%
            HttpSession session1 = request.getSession(false);
            
            if(session1 != null && session1.getAttribute("email") != null){
               String username = (String)session1.getAttribute("email");
                     
        %>   
        <div class="container">
            <h1>Welcome,  <%= username %></h1>
            <h4>Successfully logged in</h4>
            <button onclick="location.href='index.html'" >Exit</button>
        </div>
          
        <%
            }
               else{
                      response.sendRedirect("login.jsp");
                 }
                
         %>
            
    </body>
</html>
