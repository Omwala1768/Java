<%@ page import="javax.servlet.http.Cookie" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.nio.charset.StandardCharsets" %>

<html>
<head>
    <title>Store Cookie</title>
</head>
<body>

<%
    String username = request.getParameter("username");

    String encodedUsername = URLEncoder.encode(username, StandardCharsets.UTF_8.toString());

    Cookie cookie = new Cookie("username", encodedUsername);
    cookie.setMaxAge(60 * 60 * 24);

    response.addCookie(cookie);
%>

<h3>User Name stored successfully!</h3>

<a href="pract9A_readcookie.jsp">Read Cookie</a>

</body>
</html>