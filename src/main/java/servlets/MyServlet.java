package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/s")
//@WebServlet(name="TestServlet",urlPatterns = "/TestServlet2")
public class MyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
        super.doPost(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   throws ServletException, IOException {
        response.setContentType("text/html;  charset=UTF-8"); //https://javatalks.ru/topics/13841

        PrintWriter out = response.getWriter();
        out.println("Encoding: " + response.getCharacterEncoding() );
        try {
            out.println(
                    "<html>" +
                            "<head>" +
                            "<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">" +
                            "<title>Документ</title>" +
                            "<link href=\"css/style.css\" rel=\"stylesheet type=\"text/css\">"+
                            "</head>" +
                            "<body>" +
                            "<table width=\"450\" border=\"0\" cellpadding =\"0\" cellspacing=\"0\">" +
                            "<tr>" +
                            "<td colspan=\"2\" align=\"center\"> <strong> <font color=\"FF0000\" size=\"5\"> Секретный документ </font> </strong> </td>" +
                            "</tr>" +
                            "<td width=\"150\" rowspan=\"2\"><img src=\"images/java.png\" alt=\"\"  width=\"119\" height=\"222\" >   </td>" +
                            "<td width=\"340\"  height=\"99\" ><table width=\"300\" border=\"1\" align=\"left\"  cellpadding =\"15\"  cellspacing=\"0\">" +
                            "<tr>" +
                            "<th align=\"left\"> <font color=\"006699\"    <strong> Имя    </strong>      </font> </th>" +
                            "<th align=\"left\"> <font color=\"006699\"    <strong> Телефон</strong>      </font> </th>" +
                            "</tr>" +
                            "<tr>" +
                            "<td>Петр</td>" +
                            "<td>555444</td>" +
                            "</tr>" +
                            "<tr>" +
                            "<td>Иван</td>" +
                            "<td>111222</td>" +
                            "</tr>" +
                            "</table></td>" +
                            "</tr>" +
                            "<tr>" +
                            "<td>" +
                            "<ul>" +
                            "<li>Тестовый документ 1 </li>" +
                            "<li>Тестовый документ 2 </li>" +
                            "<li>Тестовый документ 3 </li>" +
                            "</ul>" +
                            "</td>" +
                            "</tr>" +
                            "<tr>" +
                            "<td colspan=\"2\" >   Проект 2017 года    </td>" +
                            "</tr>" + "</table>" +
                            "</body>" +
                            "</html>"
            );

        } finally {
            out.close();
        }



    }
}
