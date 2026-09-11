<%
    String username = request.getParameter("username");

    session.setAttribute("username", username);
%>

<html>
<head>
    <title>Store Session</title>
</head>
<body>

<h3>User Name stored in session successfully!</h3>

<a href="pract9C_readSession.jsp">Read Session</a>

</body>
</html>