<%@ page import="java.sql.*" %>

<html>
<head>
    <title>Login Validation</title>
</head>
<body>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    String url = "jdbc:mysql://localhost:3306/practical10";
    String dbUsername = "root";
    String dbPassword = "root";

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            url, dbUsername, dbPassword
        );

        String sql = "SELECT * FROM users WHERE username=? AND password=?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, username);
        ps.setString(2, password);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            out.println("<h2>Login Successful!</h2>");
            out.println("<h3>Welcome, " + username + "</h3>");
        } else {
            out.println("<h2>Invalid Username or Password</h2>");
        }

        con.close();

    } catch (Exception e) {
        out.println("<h3>Error: " + e.getMessage() + "</h3>");
    }
%>

</body>
</html>