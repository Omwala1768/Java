<%@ page import="javax.servlet.http.Cookie" %>
<%@ page import="java.net.URLDecoder" %>
<%@ page import="java.nio.charset.StandardCharsets" %>

<html>
<head>
    <title>Read Cookie</title>
</head>
<body>

<h2>Stored User Name</h2>

<%
    Cookie cookies[] = request.getCookies();
    String username = "Cookie Not Found";

    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("username")) {
                username = URLDecoder.decode(cookie.getValue(), StandardCharsets.UTF_8.toString());
                break;
            }
        }
    }
%>

<h3>User Name: <%= username %></h3>

</body>
</html>