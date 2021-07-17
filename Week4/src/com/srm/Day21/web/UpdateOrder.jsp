<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%
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
    ps.close();
    conn.close();
    %>
    <script type="text/javascript">
    alert("Updated Successfully")
</script>
<%}


%>
