<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Онлайн SmartFactory::Вход</title>
    <link href="../css/style_index.css" rel="stylesheet" type="text/css">
</head>

<body>
<div class="main">

    <div class="content">
        <p class="title"><span class="text"><img src="../images/fac.png"  hspace="10" vspace="10" align="middle"></span></p>
        <p class="title">Онлайн SmartFactory</p>
        <p class="text">Добро пожаловать в онлайн моделирование производственного процесса, где вы сможете смоделировать ваш производственный процесс Доступны функции создания, редактирования, просчет процессов и др.</p>
        <p class="text">Проект находится в разработке, поэтому дизайн и функционал будет постоянно дорабатываться.</p>
        <p>&nbsp;</p>

    </div>

    <div class="wrapper">


        <form class="login_form" name="username" action="main.jsp" method="POST">
            <pre>Login:   <input type="text" name="username" value="" size="20" /></pre>
            <pre>Password:<input type="password" name="password" value="" size="20" /></pre>
            <input type="submit" value="Войти" />
        </form>

    </div>

    <div class="footer">
        Разработчик: Максим Пигнастый, 2017 г
    </div>
</div>


</body>
</html>