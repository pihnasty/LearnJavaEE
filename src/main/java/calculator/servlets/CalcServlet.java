package calculator.servlets;

import calculator.calc.CalcOperations;
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
import java.util.*;


public class CalcServlet extends HttpServlet {

    public static final String SESSION_MAP = "sessionMap";

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request, response);
        proseccRequest(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        proseccRequest(request, response);
    }

    protected void proseccRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;  charset=UTF-8"); //https://javatalks.ru/topics/13841

        Map<String,List> sessionMap = (Map<String, List>) getServletContext().getAttribute(SESSION_MAP);

        if (sessionMap==null) {
            sessionMap = new HashMap<String, List>();
        }

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>CalcServletWithParam</title>");
        out.println("</head>");
        out.println("<body>");


        getServletContext().setAttribute("getServletContext().setAttribute",new TestObject("getServletContext().setAttribute"));

        try {

            double one = Double.valueOf(request.getParameter("one"));  //.doubleValue();
            double two = Double.valueOf(request.getParameter("two"));  //.doubleValue();
            String operation = String.valueOf(request.getParameter("operation"));  //.doubleValue();

            List<String> strings = new ArrayList<String>();

            HttpSession httpSession = request.getSession(true);

            httpSession.getServletContext().setAttribute("obj", new TestObject("TestName"));



            // httpSession.getServletContext();

            List<String> listOperations;

            OperationType operationType = OperationType.valueOf(operation.toUpperCase());  //.doubleValue();

            double result = calcResult(one, two, operationType);

//            if (httpSession.isNew()) listOperations.clear();
//            else listOperations = (List<String>) httpSession.getAttribute("formula");

            if (httpSession.isNew()) listOperations = new ArrayList<String>();
            else listOperations = (ArrayList<String>) httpSession.getAttribute("formula");

            String s = one + " " + operationType.getS() + " " + two + " = " + result;
            listOperations.add(s);
            httpSession.setAttribute("formula", listOperations);

            out.println("<h1>ID Вашей сессии равен:" + httpSession.getId() + "</h1>");
            out.println("<h1>Список операций (всего):" + listOperations.size() + "</h1>");

            for (String oper : listOperations)  out.print("<h3>"+oper+"</h3>");

            sessionMap.put(httpSession.getId(),listOperations);
            getServletContext().setAttribute(SESSION_MAP, sessionMap);

            for (Map.Entry<String,List> entry : sessionMap.entrySet()) {
                String sessionId = entry.getKey();
                List listOper = entry.getValue();
                out.println("<h1 style=\"color:\">"+sessionId+"</h1>");

                for (Object str: listOper)  out.println("<h3>"+str+"</h3>");

            }



            out.println("<h3>" +
                    s +
                    "</h3>");
            out.println("</body>");
            out.println("</html>");
        } catch (Exception ex) {
            out.println("<h3 style=\"color=red;\"> Возникла ошибка. Проверьте параметры</h3>");
            out.println("<h3 style=\"color=red;\"> Имена параметров должны быть one,two,operation</h3>");
            out.println("<h3 style=\"color=red;\"> Значения one,twoдолжны быть числами</h3>");
            out.println("<h3 style=\"color=red;\"> Пример:     http://localhost:8080/CalcServlet2?one=2&two=4&operation=add</h3>");
//            response.sendError(HttpServletResponse.SC_NOT_FOUND);
//            response.sendError(HttpServletResponse.SC_BAD_REQUEST);
            try {
                throw ex;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            out.println("</body>");
            out.println("</html>");
            out.close();
        }

    }

    private double calcResult(double one, double two, OperationType operationType) {
        double result = 0;
        switch (operationType) {
            case ADD:
                result = CalcOperations.add(one, two);
                break;
            case SUBTRACK:
                result = CalcOperations.subtrack(one, two);
                break;
            case MULTIPLY:
                result = CalcOperations.multiply(one, two);
                break;
            case DEVIDE:
                result = CalcOperations.subtrack(one, two);
                break;
        }
        return result;
    }

}
