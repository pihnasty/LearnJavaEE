<%@ page import="services.SmartProjectConstant" %>
<%@ page import="java.util.ArrayList" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<%@include file="../jspf/middle.jspf" %>

<%
    request.setCharacterEncoding("UTF-8");


%>

<jsp:useBean id="technologicalProcessList" class="services.TechnologicalProcessList" scope="page"/>



<table border="1">
    <br></br>
<br></br>

    <caption>Технологический процесс №1: Список технологических операций</caption>
    <tr>
        <th><%=SmartProjectConstant.ColumnNameTechnologicalProcess.NUMBER.getDescription() %>
        </th>
        <th><%=SmartProjectConstant.ColumnNameTechnologicalProcess.NAME_OPERATION.getDescription() %>
        </th>
        <th><%=SmartProjectConstant.ColumnNameTechnologicalProcess.PERFORMANCE.getDescription() %>
        </th>
        <th><%=SmartProjectConstant.ColumnNameTechnologicalProcess.EQUIPMENT.getDescription() %>
        </th>
        <th><%=SmartProjectConstant.ColumnNameTechnologicalProcess.SEQUENCE.getDescription() %>
        </th>
        <th><%=SmartProjectConstant.ColumnNameTechnologicalProcess.IMAGE.getDescription() %>
        </th>
    </tr>


    <div>
        <h3>${param.name}</h3>
        <%

       //     ArrayList<Book> list = bookList.getBooksByGenre(genreId);
       //     session.setAttribute("currentBookList", list);

            Integer numberRow = 1;

            ArrayList<TechnologicalProcess> list = technologicalProcessList.getAllTechnologicalProcess();
            session.setAttribute("currentList", list);

            for (TechnologicalProcess technologicalProcess : list) {

        %>
        <tr>
            <td><%=numberRow++ %>
            </td>
            <td><%=technologicalProcess.getNameOperation() %>
            </td>
            <td><%=technologicalProcess.getPerformance() %>
            </td>
            <td><%=technologicalProcess.getEquipment() %>
            </td>
            <td><%=technologicalProcess.getSequence() %>
            </td>
            <td>
                <%--<img src=<%=technologicalProcess.getImage() %>>--%>



                <img src="<%=request.getContextPath()%>/ShowImage?index=<%=list.indexOf(technologicalProcess) %>" height="80"  alt="Обложка"/>

            </td>
        </tr>
        <%


            }


        %>

        <%--<table cellpadding="30" style="font-size: 12px;">--%>

        <%--<%--%>

        <%--for (Book book : bookList.getBooksByGenre(genreId)) {--%>

        <%--%>--%>
        <%--<tr>--%>
        <%--<td style="width:400px;height: 100px;">--%>
        <%--<p style="color:#378de5 ;font-weight: bold; font-size: 15px;"> </p>--%>
        <%--<br><strong>ISBN:</strong> <%=book.getIsbn()%>--%>
        <%--<br><strong>Издательство:</strong> <%=book.getPublisher() %>--%>

        <%--<br><strong>Количество страниц:</strong> <%=book.getPageCount() %>--%>
        <%--<br><strong>Год издания:</strong> <%=book.getPublishDate() %>--%>
        <%--<br><strong>Автор:</strong> <%=book.getAuthor() %>--%>
        <%--<p style="margin:10px;"> <a href="#">Читать</a></p>--%>
        <%--</td>--%>
        <%--<td style="width:150px;height: 100px;">--%>
        <%--картинка--%>
        <%--</td>--%>
        <%--</tr>--%>
        <%--<%}%>--%>


        <%--</table>--%>
    </div>
