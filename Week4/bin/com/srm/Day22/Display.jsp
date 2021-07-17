<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
    try {
        if (request.getParameter("display") != null) {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/PizzaOrder", "diya", "diya");
            String url = "select * from pizza";

            PreparedStatement ps = conn.prepareStatement(url);
            ResultSet rs = ps.executeQuery();
%>

        <%
            while (rs.next()) {
        %>
   <table border="1" style="color: white">
       <thead><tr><th>Customer Name</th>
       <th>Address</th><th>Size</th><th>Crust Type</th><th>Payment</th><th>Zipcode</th><th>Phone No</th></thead>
    <tbody>
            <tr><td><%out.println(rs.getString(1));%></td>
            <td><%out.println(rs.getString(2));%></td>
            <td><%out.println(rs.getString(3));%></td>
            <td><%out.println(rs.getString(4));%></td>
            <td><%out.println(rs.getString(5));%></td>
            <td><%out.println(rs.getString(6));%></td>
            <td><%out.println(rs.getString(7));%></td>
            </tr>
    </tbody>
</table>



<%  }
        }
    } catch (Exception e) {
        out.print(e);
    }

%>