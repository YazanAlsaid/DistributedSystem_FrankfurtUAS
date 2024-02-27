<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Change Entry</title>
</head>
<body>
<h1>Change Entry</h1>
<form action="ChangeEntryServlet" method="post">
    <label id=entryName for="entryName">Entry Name:</label>
    <input type="text" name="entryName" required><br>
    <label id=newAmount for="newAmount">New Amount:</label>
    <input type="number" name="newAmount" required><br>
    <input type="submit" value="Change Entry">
</form>
</body>
</html>

