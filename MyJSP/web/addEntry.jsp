<%@ page language="java" %>
<html>
<head>
    <title>Add Entry</title>
</head>
<body>
<h1>Add Entry</h1>
<form action="AddEntryServlet" method="POST">
    <input type="hidden" name="accountName" value="${accountName}">

    <label for="entryName">Entry Name:</label>
    <input type="text" id="entryName" name="entryName" required><br><br>

    <label for="amount">Amount:</label>
    <input type="text" id="amount" name="amount" required><br><br>

    <label for="date">Date:</label>
    <input type="text" id="date" name="date" required><br><br>

    <input type="submit" value="Add Entry">
</form>
</body>
</html>