<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%-----------%>
<%--&lt;%&ndash;http://www.iztt.ru/proizvodstvo-i-tehnologii&ndash;%&gt;--%>
<%---------%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>Онлайн SmartFactory::Вход</title>
    <link href="css/style_index.css" rel="stylesheet" type="text/css">
</head>

<body>
<div class="main">

    <div class="content">
        <p class="title"><span class="text"><img src="images/fac.png" width="76" height="77" hspace="10" vspace="10"
                                                 align="middle"></span></p>
        <p class="title">Онлайн SmartFactory</p>
        <p class="text">Добро пожаловать в онлайн моделирование производственного процесса, где вы сможете смоделировать
            ваш производственный процесс Доступны функции создания, редактирования, просчет процессов и др.</p>
        <p class="text">Проект находится в разработке, поэтому дизайн и функционал будет постоянно дорабатываться.</p>
        <p>&nbsp;</p>
    </div>

    <div class="login_div">
        <p class="title">Для входа введит свои данные:</p>
        <form class="login_form" name="username" action="pages/main.jsp" method="POST">
            <pre>Login:   <input type="text" name="login" value="" size="20"/></pre>
            <pre>Password:<input type="password" name="password" value="" size="20"/></pre>
            <input type="submit" value="Войти"/>
        </form>

    </div>

    <div class="footer">
        Разработчик: Максим Пигнастый, 2017 г
    </div>

</div>

</body>
</html>
