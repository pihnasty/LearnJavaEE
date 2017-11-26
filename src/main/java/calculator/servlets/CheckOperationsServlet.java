package calculator.servlets;

import calculator.calc.OperationType;
import calculator.calc.TestObject;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;

//import static java.util.Objects.isNull;


/**
 * Created by pom on 05.11.2017.
 */
public class CheckOperationsServlet extends HttpServlet {

    List<String> listOperations = new ArrayList<String>();

    @Override
    public void init (ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
        super.doPost(request, response);
        proseccRequest ( request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   throws ServletException, IOException {
        response.setContentType("text/html");
        proseccRequest ( request, response);
    }

    protected void proseccRequest (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;  charset=UTF-8"); //https://javatalks.ru/topics/13841



        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Second Servlet </title>");
        out.println("</head>");
        out.println("<body>");

        try {

            HttpSession httpSession = request.getSession(true);


            Object attr = httpSession.getAttribute("formula");

            if (attr instanceof ArrayList) {
                ArrayList list = (ArrayList) attr;
                out.println("<h1>Список операций</h1>");
                for (Object str : list) out.println("<h3>" +str+"</h3>");
            } else  out.println("<h1>Операция не найдена </h1>");

            out.println("<h1>"+httpSession.getServletContext().getAttribute("obj")+ "</h1>");

            out.println("<h1>"+((TestObject)getServletContext().getAttribute("getServletContext().setAttribute")).getName()+ "</h1>");



            out.println("</body>");
            out.println("</html>");
        } catch(Exception ex) {
            out.println("<h3 style=\"color=red\"> Нет данных </h3>");
        } finally {
            out.println("</body>");
            out.println("</html>");
            out.close();
        }

    }

}
