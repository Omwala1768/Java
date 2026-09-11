<%@ page import="java.sql.*" %>

<html>
<head>
    <title>Registration</title>
</head>
<body>

<%
    String name = request.getParameter("name");
    String email = request.getParameter("email");
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

        String sql = "INSERT INTO registration (name, email, username, password) VALUES (?, ?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, name);
        ps.setString(2, email);
        ps.setString(3, username);
        ps.setString(4, password);

        ps.executeUpdate();

        out.println("<h2>Registration Successful!</h2>");
        out.println("<h3>Welcome, " + name + "</h3>");

        con.close();

    } catch (Exception e) {
        out.println("<h3>Error: " + e.getMessage() + "</h3>");
    }
%>

</body>
</html>