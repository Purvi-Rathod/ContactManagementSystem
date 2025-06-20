<%-- 
    Document   : addContact
    Created on : 4 May, 2025, 11:45:07 PM
    Author     : purvi
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Contact</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/addContact.css">
</head>
<body>
    <div class="container">
        <h2>Add New Contact</h2>
        <form action="AddContactServle" method="post">
            <div class="form-group">
                <label for="id">ID</label>
                <input type="text" name="id" id="id" placeholder="Enter ID" required>
            </div>
            <div class="form-group">
                <label for="name">Name</label>
                <input type="text" name="name" id="name" placeholder="Enter Name" required>
            </div>
            <div class="form-group">
                <label for="phone">Phone</label>
                <input type="tel" name="phone" id="phone" placeholder="147-147-1245" pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}" required>
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" name="email" id="email" placeholder="email@example.com" required>
            </div>
            <div class="button-group">
                <button type="submit">Add Contact</button>
                <a href="index.jsp">Back to Home</a>
            </div>
        </form>
    </div>
</body>
</html>