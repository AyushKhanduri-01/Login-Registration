<%-- 
    Document   : register
    Created on : 01-Feb-2024, 8:42:40 pm
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>register</title>
    </head>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background-color: #6f42c1;
 
        }

        .container {
            text-align: center;
            background-color: #ffffff; /* Background color for the container */
            padding: 30px;
             width: 50vh;
            height: 50vh;
     
            border-radius: 30px;
            box-shadow: 10px 10px 10px rgba(0, 0, 0.5, 0.5); /* Adding a subtle box shadow for depth */
        }

        form {
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        label {
            margin-bottom: 10px;
        }

        input {
            padding: 10px;
            margin-bottom: 15px;
            width: 100%;
            box-sizing: border-box;
        }

        .button {
            padding: 10px 20px;
            font-size: 16px;
            background-color: #4CAF50; /* Green color for the buttons */
            color: #fff; /* White text color for better contrast */
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        /* Change button color on hover for better user interaction */
        .button:hover {
            background-color: #45a049;
        }

        .back-button {
            background-color: #ccc; /* Grey color for the back button */
            margin-top: 10px;
        }

        /* Change back button color on hover */
        .back-button:hover {
            background-color: #bbb;
        }
    </style>
</head>
<body>

<div class="container">
    <form action="register" method="post">
        <label for="username">Username:</label>
        <input type="username" id="username" name="username" required>
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>

        <button class="button" type="submit">Register</button>
    </form>

    <button class="back-button" onclick="location.href='index.html'">Back</button>
</div>

</body>
</html>
