<%@ page import="services.SmartProjectConstant" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="beans.Monitoring" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<%@include file="../jspf/middle.jspf" %>

<%
    request.setCharacterEncoding("UTF-8");


%>

<jsp:useBean id="monitoringList" class="services.MonitoringList" scope="page"/>



<table border="1">
    <br></br>
    <br></br>

    <caption>Мониторинг №1: </caption>
    <tr>
        <th><%=SmartProjectConstant.ColumnNameMonitoring.NUMBER.getDescription() %>
        </th>
        <th><%=SmartProjectConstant.ColumnNameMonitoring.NAME_OPERATION.getDescription() %>
        </th>
        <th><%=SmartProjectConstant.ColumnNameMonitoring.STATUS_PACKLOGS.getDescription() %>
        </th>
        <th><%=SmartProjectConstant.ColumnNameMonitoring.PLAN_CAPACITY.getDescription() %>
        </th>
        <th><%=SmartProjectConstant.ColumnNameMonitoring.ACTUAL_CAPACITY.getDescription() %>
        </th>
        <th><%=SmartProjectConstant.ColumnNameMonitoring.PERFOMANCE_DEVIATION.getDescription() %>
        </th>
        <th><%=SmartProjectConstant.ColumnNameMonitoring.PREPAREDNESS_RATE_PLAN.getDescription() %>
        </th>
        <th><%=SmartProjectConstant.ColumnNameMonitoring.PREPAREDNESS_RATE_FACT.getDescription() %>
        </th>
        <th><%=SmartProjectConstant.ColumnNameMonitoring.PERFORMANCE_ABERRANT.getDescription() %>
        </th>

    </tr>


    <div>

        <%

            //     ArrayList<Book> list = bookList.getBooksByGenre(genreId);
            //     session.setAttribute("currentBookList", list);

            Integer numberRow = 1;

            ArrayList<Monitoring> list = monitoringList.getAllMonitoring();
            session.setAttribute("MonitoringCurrentList", list);

            for (Monitoring monitoring : list) {

        %>
        <tr>


            <td><%=numberRow++ %>
            </td>
            <td><%=monitoring.getNameOperation() %>
            </td>
            <td><%=monitoring.getStatusPacklogs() %>
            </td>
            <td><%=monitoring.getPlanCapacity() %>
            </td>
            <td><%=monitoring.getActualCapacity() %>
            </td>
            <td><%=monitoring.getPerformanceDeviation() %>
            </td>
            <td><%=monitoring.getPreparednessRatePlan() %>
            </td>
            <td><%=monitoring.getPreparednessRateFact() %>
            </td>
            <td><%=monitoring.getPerformanceAberrant() %>
            </td>
                <%--<img src=<%=technologicalProcess.getImage() %>>--%>



                <%--//<img src="<%=request.getContextPath()%>/ShowImage?index=<%=list.indexOf(monitoring) %>" height="80"  alt="Обложка"/>--%>

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
