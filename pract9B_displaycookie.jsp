<%@ page import="javax.servlet.http.Cookie" %>

<html>
<head>
    <title>Display Cookies</title>
</head>
<body>

<h2>Cookies Stored on Client</h2>

<%
    Cookie cookies[] = request.getCookies();

    if (cookies != null) {
        for (Cookie cookie : cookies) {
%>

            <p>
                Cookie Name: <%= cookie.getName() %><br>
                Cookie Value: <%= cookie.getValue() %>
            </p>

<%
        }
    } else {
%>

        <p>No cookies found.</p>

<%
    }
%>

</body>
</html>