<%-- 
    Document   : addContact
    Created on : 4 May, 2025, 11:45:07 PM
    Author     : purvi
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Contact</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    
    <center>
            <form action="AddContactServle" method="post">
                <table  border='0' width='320px' align="center">
                    <center>
                        <tr>
                            <td align="center"><strong>Add New Contact</strong></td>
                        </tr>
                    </center>
                <table  border='0' width='320px' align="center">
                    <tr>
                        <td align='center'><b>ID :</b></td>
                        <td><input type='text' name="id" placeholder="Enter ID"></td>
                    </tr>
		
                    <tr>
                        <td align='center'><b>Name :</b></td>
                        <td><input type='text' name="name" placeholder="Enter Name"></td>
                    </tr>
		
                    <tr>
                        <td align='center'><b>Phone :</b></td>
                        <td><input type="text" name="phone" placeholder="Phone No. 147-147-1245 "></td>
                    </tr>
		
                    <tr>
                        <td align="center"><B>Email :</B></td>
                        <td><input type='text' name="email" placeholder="email@example.com"></td>
                    </tr>
		
		<table border='0' width='320px' align='center'>
                    <tr>
    			<td align='center'>
                            <input type="submit" name="Submit" value="Add Contact" >
                        </td>
                    </tr>
                    <tr>
                        <td align = 'center'>
                            <a href="index.jsp" class="btn">Back to Home</a>
                        </td>
                    </tr>
                    <tr> <td>&nbsp;</td> </tr>
		</table>	
                </table>
                </table>
            </form>
    </center>
</body>
</html>
