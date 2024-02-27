<%@ page language="java" %>
<html>
<head>
    <title>Create Account</title>
</head>
<body>
<h1>Create Account</h1>
<form action="AccountServlet" method="POST">
    <label for="accountName">Account Name:</label>
    <input type="text" id="accountName" name="accountName" required><br><br>
    <input type="submit" value="Create Account">
</form>
</body>
</html>
