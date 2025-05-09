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
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    </div>
    <%
//            String id = (String)session.getAttribute("id");
            String id = request.getParameter("id");
            if(id == null)
            {
                response.sendRedirect("viewContacts.jsp");
            }
        
            Statement st = DBConnector.getStatement();
            String query = "SELECT * FROM contacts WHERE id ='"+id+"'";
            ResultSet rs = st.executeQuery(query);
        
            while(rs.next())
            {
        %>
        <h1>Edit Contact</h1>
        <form action="EditContactServlet" method="post">
                <table  border='0' width='320px' align="center">
                    <tr> <td>&nbsp;</td> </tr>
                    <tr>
			<td align='center'>ID :</td>
                        <td><input type='text' name="id" value="<%=rs.getString(1)%>"></td>
                    </tr>
		
                    <tr>
                        <td align='center'><b>Name :</b></td>
                        <td><input type='text' name="name" value="<%=rs.getString(2)%>"></td>
                    </tr>
		
                    <tr>
                        <td align="center"><B>Phone :</B></td>
                        <td><input type='text' name="phone" value="<%=rs.getString(3)%>"></td>
                    </tr>
                    
                    <tr>
                        <td align='center'><b>Email :</b></td>
                        <td><input type="text" name="email" value="<%=rs.getString(4)%>"></td>
                    </tr>
        <%
            }
        %>
		<table border='0' width='320px' align='center'>
                    <tr>
    			<td align='center'>
                            <input type="submit" name="Submit" value="Update Contact" >
                        </td>
                        <td>
                            <a href="index.jsp" class="btn">Back to Home</a>
                        </td>
                    </tr>
	
                    <tr> <td>&nbsp;</td> </tr>
		</table>	
                </table>
            </form>
</body>
</html>
