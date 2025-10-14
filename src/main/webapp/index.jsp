<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width,initial-scale=1" />
  <title>Person Details Form</title>
</head>
<body>
  <h1>Enter Person Details</h1>
  
<% if(request.getAttribute("error") != null) { %>
    <div style="color:red; font-weight:bold;">
        <%= request.getAttribute("error") %>
    </div>
<% } %>

<form action="student" method="post">
    Name: <input type="text" name="name"><br>
    Address: <input type="text" name="address"><br>
    Contact: <input type="text" name="contact"><br>
    Password: <input type="password" name="password"><br>
    <input type="submit" value="Register">
</form>

</body>
</html>

