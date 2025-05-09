package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import db.DBConnector;

public final class editContact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Edit Contact</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/styles.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    </div>\n");
      out.write("    ");

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
        
      out.write("\n");
      out.write("        <h1>Edit Contact</h1>\n");
      out.write("        <form action=\"EditContactServlet\" method=\"post\">\n");
      out.write("                <table  border='0' width='320px' align=\"center\">\n");
      out.write("                    <tr> <td>&nbsp;</td> </tr>\n");
      out.write("                    <tr>\n");
      out.write("\t\t\t<td align='center'>ID :</td>\n");
      out.write("                        <td><input type='text' name=\"id\" value=\"");
      out.print(rs.getString(1));
      out.write("\"></td>\n");
      out.write("                    </tr>\n");
      out.write("\t\t\n");
      out.write("                    <tr>\n");
      out.write("                        <td align='center'><b>Name :</b></td>\n");
      out.write("                        <td><input type='text' name=\"name\" value=\"");
      out.print(rs.getString(2));
      out.write("\"></td>\n");
      out.write("                    </tr>\n");
      out.write("\t\t\n");
      out.write("                    <tr>\n");
      out.write("                        <td align=\"center\"><B>Phone :</B></td>\n");
      out.write("                        <td><input type='text' name=\"phone\" value=\"");
      out.print(rs.getString(3));
      out.write("\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td align='center'><b>Email :</b></td>\n");
      out.write("                        <td><input type=\"text\" name=\"email\" value=\"");
      out.print(rs.getString(4));
      out.write("\"></td>\n");
      out.write("                    </tr>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("\t\t<table border='0' width='320px' align='center'>\n");
      out.write("                    <tr>\n");
      out.write("    \t\t\t<td align='center'>\n");
      out.write("                            <input type=\"submit\" name=\"Submit\" value=\"Update Contact\" >\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <a href=\"index.jsp\" class=\"btn\">Back to Home</a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("\t\n");
      out.write("                    <tr> <td>&nbsp;</td> </tr>\n");
      out.write("\t\t</table>\t\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
