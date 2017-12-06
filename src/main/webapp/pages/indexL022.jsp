<%--
  Created by IntelliJ IDEA.
  User: pom
  Date: 31.10.2017
  Time: 7:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/xml" %>
<html>
  <head>
    <title>$L022$</title>
  </head>
  <body>
        <form name="username" action="main.jsp" method="POST" >
            <input type="text" name="username" size="10"    />
            <input type="password" name="password" size="20"    />
            <input type="submit" name="login" value="Войти" />
            <%--<small>--%>
            <%--<input type="submit" name="login" value="Войти">--%>
            <%--</small>--%>
            <%--<input type="text" name="username" value="" size="20" />--%>
            <%--<input tupe="submit" value="Войти" size="80" />--%>
            <%--<button tupe="submit" name="Button"   value="Войти" size="40"/>--%>
        </form>
        <form name="username" action="main.jsp" method="GET" >
            <input type="text" name="username" size="10"    />
            <input type="password" name="password" size="20"    />
            <input type="submit" name="login" value="Войти2" />
            <%--<small>--%>
            <%--<input type="submit" name="login" value="Войти">--%>
            <%--</small>--%>
            <%--<input type="text" name="username" value="" size="20" />--%>
            <%--<input tupe="submit" value="Войти" size="80" />--%>
            <%--<button tupe="submit" name="Button"   value="Войти" size="40"/>--%>
        </form>

        <%--http://orlova.rsue.ru/content/sst/j2ee2.htm--%>
        <%--<form action="Registration" method="post">--%>
            <%--Пользователь: <input type="text" name="user" size="10"><br>--%>
            <%--Пароль: <input type="password" name="password" size="10"><br>--%>
            <%--<p>--%>
            <%--<table>--%>
                <%--<tr>--%>
                    <%--<th><small>--%>
                        <%--<input type="submit" name="login" value="Войти в систему">--%>
                    <%--</small>--%>
                    <%--<th><small>--%>
                        <%--<input type="submit" name="registration" value="Зарегистрироваться">--%>
                    <%--</small>--%>
            <%--</table>--%>
        <%--</form>--%>
  </body>
</html>
