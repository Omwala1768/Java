<%@ page import="java.sql.*" %>

<html>
<head>
    <title>Display Records</title>
</head>
<body>

<h2>All Registration Records</h2>

<table border="1" cellpadding="10">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Username</th>
        <th>Password</th>
    </tr>

<%
    String url = "jdbc:mysql://localhost:3306/practical10";
    String dbUsername = "root";
    String dbPassword = "root";

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            url, dbUsername, dbPassword
        );

        Statement stmt = con.createStatement();

        String sql = "SELECT * FROM registration";

        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
%>

    <tr>
        <td><%= rs.getInt("id") %></td>
        <td><%= rs.getString("name") %></td>
        <td><%= rs.getString("email") %></td>
        <td><%= rs.getString("username") %></td>
        <td><%= rs.getString("password") %></td>
    </tr>

<%
        }

        con.close();

    } catch (Exception e) {
        out.println("<h3>Error: " + e.getMessage() + "</h3>");
    }
%>

</table>

</body>
</html>