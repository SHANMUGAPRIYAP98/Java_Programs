<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%
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
%>
<script type="text/javascript">
    alert("Order Placed Successfully")
</script>
<%
    }
%>
