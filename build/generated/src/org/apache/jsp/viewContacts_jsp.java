package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import dto.ContactDTO;
import dao.ContactDAO;
import java.util.ArrayList;

public final class viewContacts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>View Contacts</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/viewContacts.css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    ");

            
            ContactDAO  ob1 = new ContactDAO();
            ArrayList<ContactDTO> l1 = ob1.getAllUserDetails();
            
            Iterator<ContactDTO> i = l1.iterator();
            
    
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h1>All Contacts</h1>\n");
      out.write("        <table>\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Name</th>\n");
      out.write("                    <th>Email</th>\n");
      out.write("                    <th>Phone</th>\n");
      out.write("                    <th colspan=\"2\">Actions</th>\n");
      out.write("                    <th></th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    while(i.hasNext())
                    {
                        ContactDTO cont = i.next();  
                
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                    <td><strong>");
      out.print(cont.getId());
      out.write("</strong></td>\n");
      out.write("                    <td><strong>");
      out.print(cont.getName());
      out.write("</strong></td>\n");
      out.write("                    <td><strong>");
      out.print(cont.getPhone());
      out.write("</strong></td>\n");
      out.write("                    <td><strong>");
      out.print(cont.getEmail());
      out.write("</strong></td>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"editContact.jsp?id=");
      out.print( cont.getId() );
      out.write("\">Edit</a>\n");
      out.write("                    </td>\n");
      out.write("                    <td class=\"delete\">\n");
      out.write("                        <a href=\"deleteContact.jsp?id=");
      out.print( cont.getId() );
      out.write("\">Delete</a>\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("<!--\n");
      out.write("                    <form action=\"editContact.jsp\" method=\"post\">\n");
      out.write("                        <input type=\"hidden\" name=\"id\" value=\"");
      out.print( cont.getId() );
      out.write("\" />\n");
      out.write("                        <td><input name=\"edit\" type=\"submit\" value=\"Edit\" align=\"left\" /></td>\n");
      out.write("                    </form>\n");
      out.write("                    <form action=\"deleteContact.jsp\" method=\"post\">\n");
      out.write("                        <input type=\"hidden\" name=\"id\" value=\"");
      out.print( cont.getId() );
      out.write("\" />\n");
      out.write("                        <td><input name=\"delete\" type=\"submit\" value=\"Delete\" align=\"left\" /></td>\n");
      out.write("                    </form>\n");
      out.write("                    </tr>-->\n");
      out.write("                ");
                
                    }
                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("        <center>\n");
      out.write("            <a href=\"index.jsp\" class=\"btn\">Back to Home</a>\n");
      out.write("        </center>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
