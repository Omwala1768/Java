<html>
<head>
    <title>Read Session</title>
</head>
<body>

<h2>Stored User Name</h2>

<%
    String username = (String) session.getAttribute("username");
%>

<h3>User Name: <%= username %></h3>

</body>
</html>