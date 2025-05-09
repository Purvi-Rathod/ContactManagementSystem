package controller;


import dto.ContactDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.EditContactAuthenticator;

/**
 *
 * @author purvi
 */
public class EditContactServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("viewContacts.jsp");
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
        
        EditContactAuthenticator e1 = new EditContactAuthenticator();
        boolean edit = e1.isEdit(cont);
         if(edit)
        {
            HttpSession session = request.getSession(true);
            session.setAttribute("id", id);
            response.sendRedirect("editContact.jsp");
        }
        else 
        {
            response.sendRedirect("editFail.jsp");
        }
        
    }
}