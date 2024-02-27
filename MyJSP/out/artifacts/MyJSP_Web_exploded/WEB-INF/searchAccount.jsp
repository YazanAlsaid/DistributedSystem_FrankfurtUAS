<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Search Account Entry</title>
</head>
<body>
<h1>Search Account Entry</h1>
<!-- Form for searching an accounting entry -->
<form method="POST" action="searchAccountEntry">
    <label>Amount:</label>
    <input type="number" name="amount" required>
    <button type="submit">Search</button>
</form>
</body>
</html>

