<%@ page session="true" %>

<html>

<body>

<h2>Welcome</h2>

<%

String user=
(String)session.getAttribute("username");

if(user==null){

response.sendRedirect("login.jsp");

}

%>

Welcome <%=user%>

<br><br>

<a href="../logout">
Logout
</a>

</body>

</html>