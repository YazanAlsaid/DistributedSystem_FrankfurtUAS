<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Account Entry</title>
</head>
<body>
<h1>Add Account Entry</h1>
<!-- Form for adding a new accounting entry -->
<form method="POST" action="addAccountEntry">
    <label>Amount:</label>
    <input type="number" name="amount" required>
    <button type="submit">Add Entry</button>
</form>
</body>
</html>
