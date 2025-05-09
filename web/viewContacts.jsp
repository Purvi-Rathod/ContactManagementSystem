<%-- 
    Document   : viewContacts
    Created on : 4 May, 2025, 4:12:03 PM
    Author     : purvi
--%>

<%@page import="java.util.Iterator"%>
<%@page import="dto.ContactDTO"%>
<%@page import="dao.ContactDAO"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Contacts</title>
    <link rel="stylesheet" href="css/viewContacts.css" />
</head>
<body>
    
    <%
            
            ContactDAO  ob1 = new ContactDAO();
            ArrayList<ContactDTO> l1 = ob1.getAllUserDetails();
            
            Iterator<ContactDTO> i = l1.iterator();
            
    %>
    <div class="container">
        <h1>All Contacts</h1>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Phone</th>
                    <th>Email</th>
                    <th colspan="2">Actions</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <%
                    while(i.hasNext())
                    {
                        ContactDTO cont = i.next();  
                %>
                    <tr>
                    <td><strong><%=cont.getId()%></strong></td>
                    <td><strong><%=cont.getName()%></strong></td>
                    <td><strong><%=cont.getPhone()%></strong></td>
                    <td><strong><%=cont.getEmail()%></strong></td>
                    <td>
                        <a href="editContact.jsp?id=<%= cont.getId() %>">Edit</a>
                    </td>
                    <td class="delete">
                        <a href="deleteContact.jsp?id=<%= cont.getId() %>">Delete</a>
                    </td>

<!--
                    <form action="editContact.jsp" method="post">
                        <input type="hidden" name="id" value="<%= cont.getId() %>" />
                        <td><input name="edit" type="submit" value="Edit" align="left" /></td>
                    </form>
                    <form action="deleteContact.jsp" method="post">
                        <input type="hidden" name="id" value="<%= cont.getId() %>" />
                        <td><input name="delete" type="submit" value="Delete" align="left" /></td>
                    </form>
                    </tr>-->
                <%                
                    }
                %>
            </tbody>
        </table>
        <center>
            <a href="index.jsp" class="btn">Back to Home</a>
        </center>
        
    </div>
</body>
</html>