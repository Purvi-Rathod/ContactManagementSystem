package controller;

import dto.ContactDTO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.HttpSession;
import model.AddContactAuthenticator;

/**
 *
 * @author purvi
 */
public class AddContactServle extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("addContact.jsp");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        
        
        ContactDTO cont = new ContactDTO();
        cont.setId(id);
        cont.setName(name);
        cont.setPhone(phone);
        cont.setEmail(email);
        
        AddContactAuthenticator a1 = new  AddContactAuthenticator();
        boolean isAdd = a1.isAdd(cont);
        if(isAdd)
        {
            HttpSession session = request.getSession(true);
            session.setAttribute("name", name);
            response.sendRedirect("viewContacts.jsp");
        }
        else
        {
            response.sendRedirect("addContactFail.html");
        }
    }
}
