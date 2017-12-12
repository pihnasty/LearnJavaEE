<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Онлайн SmartFactory::Вход</title>
    <link href="../css/main.css" rel="stylesheet" type="text/css">
</head>

<body>
<%request.setCharacterEncoding("UTF-8");%>

<div id="top">
    <h1>Тех.процесс</h1>
</div>
<div id="logout">
    <form class="login_out" name="exit" action="index.jsp" >
        <input type="submit" value="Войти" />
    </form>
</div>
<div id="Navigation">
    <ul class="Navigation">
        <li><a href="#" action="main.jsp">Главная</a></li>
        <li><a href="technologicalProcess.jsp"  method="post">Тех.процесс</a></li>
        <li><a action="main.jsp">Монитор</a>
            <ul>
                <li><a action="main.jsp">Web Development</a></li>
                <li><a action="main.jsp">Motion Graphics</a></li>
                <li><a action="main.jsp">Flash Animation</a></li>
                <li><a action="main.jsp">Logo Design</a></li>
                <li><a action="main.jsp">Photography</a></li>
            </ul>
        </li>
        <li><a action="main.jsp">Управление заказами</a></li>
        <li><a action="main.jsp">Помощь</a></li>
    </ul>
</div>

</body>
</html>