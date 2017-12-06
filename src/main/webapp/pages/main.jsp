<%--
  Created by IntelliJ IDEA.
  User: pom
  Date: 06.12.2017
  Time: 8:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main</title>
</head>
<body>
    <% request.setCharacterEncoding("UTF-8");%>
    <%="Привет   Cntr+U       Инструмент разработчика "%>
    <%="         Cntr+Shift+C Инструмент разработчика"%>
    <h3>
        <%=request.getParameter("username")%>
    </h3>
    <h3>
        <%=request.getParameter("password")%>
    </h3>
    <h3>
        ${param["password"]}
    </h3>
</body>
</html>
