package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class OrderForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/OrderData.jsp");
    _jspx_dependants.add("/Display.jsp");
    _jspx_dependants.add("/UpdateOrder.jsp");
    _jspx_dependants.add("/DeleteOrder.jsp");
  }

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
      out.write("\n");
      out.write("\n");

    String cname = request.getParameter("cname");
    String addr = request.getParameter("addr");
    String zip = request.getParameter("zip");
    String phone = request.getParameter("phone");
    String size = request.getParameter("rb");
    String pay = request.getParameter("pay");

    if (request.getParameter("but1") != null) {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/PizzaOrder", "diya", "diya");
        PreparedStatement ps = conn.prepareStatement("insert into pizza values(?,?,?,?,?,?,?)");
        ps.setString(1, cname);
        ps.setString(2, addr);
        ps.setString(3, size);
        ps.setString(4, "");
        ps.setString(5, pay);
        ps.setString(6, phone);
        ps.setString(7, zip);
        ps.executeUpdate();
        ps.close();
        conn.close();

      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    alert(\"Order Placed Successfully\")\n");
      out.write("</script>\n");

    }

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    try {
        if (request.getParameter("display") != null) {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/PizzaOrder", "diya", "diya");
            String url = "select * from pizza";

            PreparedStatement ps = conn.prepareStatement(url);
            ResultSet rs = ps.executeQuery();

      out.write("\n");
      out.write("<table border=\"1\">\n");
      out.write("    <tr><td>Customer Name</td><td>Address</td><td>Pizza Size</td><td>Crust Type</td><td>Payment</td><td>Zip code</td><td>Phone Number\n");
      out.write("        </td></tr>\n");
      out.write("        ");

            while (rs.next()) {
                out.println(rs.getString(1));
                out.println(rs.getString(2));
                out.println(rs.getString(3));
                out.println(rs.getString(4));
                out.println(rs.getString(5));
                out.println(rs.getString(6));
                out.println(rs.getString(7));
        
      out.write("\n");
      out.write("\n");
      out.write("    <tr>\n");
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
      out.write("    </tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
  }
        }
    } catch (Exception e) {
        out.print(e);
    }


      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");

if(request.getParameter("but3")!=null)
{
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/PizzaOrder", "diya", "diya");
    PreparedStatement ps=conn.prepareStatement("update pizza set addr=?,psize=?,pay=?,phone=?,zip=? where cname=?");
    ps.setString(1,request.getParameter("addr"));
    ps.setString(2, request.getParameter("psize"));
    ps.setString(3,request.getParameter("pay") );
    ps.setString(4, request.getParameter("phone"));
    ps.setString(5, request.getParameter("zip"));
    ps.setString(6,request.getParameter("cname"));
    ps.executeUpdate();
}



      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");

if(request.getParameter("but4")!=null)
{
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/PizzaOrder", "diya", "diya");
    PreparedStatement ps=conn.prepareStatement("Delete from pizza where cname=?");
    ps.setString(1,request.getParameter("cname"));
    ps.executeUpdate();
}


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Order Form</title>\n");
      out.write("        <style>\n");
      out.write("            td{\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("            fieldset\n");
      out.write("            {\n");
      out.write("                width:600px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            legend\n");
      out.write("            {\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url('D:\\\\Training2_JavaExercise\\\\PizzaOrder\\\\web\\\\WEB-INF\\\\pizzas.jpg')\">\n");
      out.write("        <form>\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Pizza Order Form</legend>\n");
      out.write("                \n");
      out.write("                <table>\n");
      out.write("                    <tr><td>Customer Name</td><td><input type=\"text\" name=\"cname\" /></td></tr>\n");
      out.write("                    <tr><td>Address</td><td><textarea name=\"addr\"></textarea></td></tr>\n");
      out.write("                    <tr><td>Zipcode </td><td><input type=\"text\" name=\"zip\" maxlength=\"6\" /></td></tr>\n");
      out.write("                    <tr><td>Phone Number</td><td><input type=\"text\" name=\"phone\" maxlength=\"10\" /></td></tr>\n");
      out.write("                    <tr><td>Pizza Size</td><td><input type=\"radio\" name=\"rb\" value=\"small\" />small</td>\n");
      out.write("                    <td><input type=\"radio\" name=\"rb\" value=\"medium\" />medium</td><td><input type=\"radio\" name=\"rb\" value=\"large\" />large</td></tr>\n");
      out.write("                    <tr><td>Crust Type</td><td><input type=\"checkbox\" name=\"cb1\" value=\"Sausage\" />Sausage</td>\n");
      out.write("                    <td><input type=\"checkbox\" name=\"cb2\" value=\"Olives\" />Olives</td>\n");
      out.write("                    <td><input type=\"checkbox\" name=\"cb3\" value=\"Paneer\" />Paneer</td>\n");
      out.write("                    <td><input type=\"checkbox\" name=\"cb4\" value=\"Extra Cheese\" />Extra Cheese</td></tr>\n");
      out.write("                    <tr><td>Select Payment</td><td><select name=\"pay\">\n");
      out.write("                                <option value=\"Credit Card\">Credit Card</option>\n");
      out.write("                                <option value=\"Debit Card\">Debit Card</option>\n");
      out.write("                                <option value=\"Cash on Delivery\">Cash on Delivery</option>\n");
      out.write("                            </select></td></tr>\n");
      out.write("                    <tr><td><input type=\"submit\" name=\"but1\" value=\"Place Order\"/></td>\n");
      out.write("                        <td><input type=\"submit\" name=\"display\" value=\"Display Order\"></td>\n");
      out.write("                        <td><input type=\"submit\" name=\"but2\" value=\"Clear Order\"/></td>\n");
      out.write("                        <td><input type=\"submit\" name=\"but3\" value=\"Update Order\"/></td>\n");
      out.write("                        <td><input type=\"submit\" name=\"but4\" value=\"Delete Order\"/></td>\n");
      out.write("                    </tr>       \n");
      out.write("                </table>\n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
