package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Display_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 
    try
    {
    if (request.getParameter("display") != null) {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/PizzaOrder", "diya", "diya");
        String url = "select * from pizza";

        PreparedStatement ps = conn.prepareStatement(url);
        ResultSet rs = ps.executeQuery();
        
      out.write("\n");
      out.write("        <table border=\"1\">\n");
      out.write("                 <tr><td>Customer Name</td><td>Address</td><td>Pizza Size</td><td>Crust Type</td><td>Payment</td><td>Zip code</td><td>Phone Number\n");
      out.write("        </td></tr>\n");
      out.write("        ");

        while (rs.next()) {
        
      out.write("\n");
      out.write("        <tr border=\"1\">\n");
      out.write("        <td>");
 out.println(rs.getString(1));
      out.write("</td>\n");
      out.write("        <td>");
 out.println(rs.getString(2));
      out.write("</td>\n");
      out.write("        <td>");
 out.println(rs.getString(3));
      out.write("</td>\n");
      out.write("        <td>");
 out.println(rs.getString(4));
      out.write("</td>\n");
      out.write("        <td>");
 out.println(rs.getString(5));
      out.write("</td>\n");
      out.write("        <td>");
 out.println(rs.getString(6));
      out.write("</td>\n");
      out.write("        <td>");
 out.println(rs.getString(7));
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("        </table>\n");
      out.write("      ");
  }
    }
    }
    catch(Exception e)
    {
        out.print(e);
    }
        
 
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
