<!DOCTYPE html>
<html>
<head>
<title>Session Details</title>

</head>
<body>
	<h2>Session Details</h2>

	<%
	Cookie[] ck = request.getCookies();
	%>

	<%
	for (Cookie cc : ck) {
	%>

	<%
	if (cc.getName().equals(cc.getValue())) {
	%>

	<%
	String name = cc.getValue();
	%>

	<%
	if (name != null) {
	%>
	<%="Welcome " + " " + name%>

	<%
	}
	%>
	<%
	}
	%>
	<%
	}
	%>




	<%-- <p>
		Session ID:
		<%=sessionId%></p>

	Last Access Time:
	<%=new java.util.Date(lastAccessTime)%></p> --%>
</body>


</html>


</body>
</html>