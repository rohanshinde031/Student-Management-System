<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Successful</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            text-align: center;
            padding-top: 50px;
        }
        .message {
            background-color: #d4edda;
            color: #155724;
            display: inline-block;
            padding: 20px;
            border-radius: 10px;
            border: 1px solid #c3e6cb;
        }
        a {
            display: block;
            margin-top: 20px;
            text-decoration: none;
            color: #007bff;
        }
    </style>
</head>
<body>
<p style="color:green; font-weight:bold;">
    ${message}
</p>
    <div class="message">
        <h1>Registration Successful!</h1>
        <p>Welcome, <strong>${message}</strong></p>
    </div>
    <a href="index.jsp">Back to Home</a>
</body>
</html>
    