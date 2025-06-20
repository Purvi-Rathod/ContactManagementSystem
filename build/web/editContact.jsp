<%-- 
    Document   : editContact
    Created on : 4 May, 2025, 11:46:03 PM
    Author     : purvi
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="db.DBConnector"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Contact</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/edit-styles.css">
</head>
<body>
    <div class="container">
        <h2>Edit Contact</h2>
        <%
            String id = request.getParameter("id");
            if (id == null) {
                response.sendRedirect("viewContacts.jsp");
                return;
            }

            Statement st = DBConnector.getStatement();
            String query = "SELECT * FROM contacts WHERE id ='" + id + "'";
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
        %>
        <form action="EditContactServlet" method="post">
            <div class="form-group">
                <label for="id">ID</label>
                <input type="text" name="id" id="id" value="<%=rs.getString(1)%>" readonly>
            </div>
            <div class="form-group">
                <label for="name">Name</label>
                <input type="text" name="name" id="name" value="<%=rs.getString(2)%>" required>
            </div>
            <div class="form-group">
                <label for="phone">Phone</label>
                <input type="tel" name="phone" id="phone" value="<%=rs.getString(3)%>" pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}" required>
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" name="email" id="email" value="<%=rs.getString(4)%>" required>
            </div>
            <div class="button-group">
                <button type="submit">Update Contact</button>
                <a href="index.jsp">Back to Home</a>
            </div>
        </form>
        <%
            } else {
                response.sendRedirect("editFail.jsp");
            }
        %>
    </div>
</body>
</html>