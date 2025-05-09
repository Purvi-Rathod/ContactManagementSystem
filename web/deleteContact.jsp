<%-- 
    Document   : deleteContact
    Created on : 5 May, 2025, 3:21:40 AM
    Author     : purvi
--%>

<%@page import="java.sql.Statement"%>
<%@page import="db.DBConnector"%>
<%@page import="java.sql.SQLException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Contact</title>
    </head>
    <body>
        <%
//            String id = (String)session.getAttribute("id");
            String id = request.getParameter("id");
            if(id == null)
            {
                response.sendRedirect("index.jsp");
            }
            try
            {
                Statement st = DBConnector.getStatement();
                String query = "DELETE FROM contacts where id = '"+id+"' "; 
            
                int i = st.executeUpdate(query);
                if(i>0)
                {
                    System.out.println(i+" Record  Deleted");
                    response.sendRedirect("viewContacts.jsp");
                }
                else
                {
                    System.out.println(" Record Deletion Failed");
                    response.sendRedirect("deletFail.jsp");
                    
                }
            }
            catch(SQLException e)
            {
                System.out.println(e);
                
            }
            
        %>
    </body>
</html>
