<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Show Account Entries</title>
</head>
<body>
<h1>Show Account Entries</h1>
<!-- Display the list of accounting entries -->
<%-- Retrieve the list of accounting entries from the session or a data source --%>
<%-- Iterate over the entries and display them --%>
<c:forEach var="entry" items="${accountEntries}">
    <p>Entry ID: ${entry.id}</p>
    <p>Amount: ${entry.amount}</p>
</c:forEach>
</body>
</html>
