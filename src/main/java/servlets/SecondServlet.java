package servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

//@WebServlet(name="TestServlet",urlPatterns = "/TestServlet2")
public class SecondServlet  extends HttpServlet {

    int count = 0;

    @Override
    public void init (ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
        super.doPost(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   throws ServletException, IOException {
        response.setContentType("text/html");

        proseccRequest ( request, response);

        Enumeration en  = request.getParameterNames();

        while ( en.hasMoreElements() ) {
            System.out.println("p4="+en.nextElement());
        }
    }

    protected void proseccRequest (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;  charset=UTF-8"); //https://javatalks.ru/topics/13841

        count++;

        request.setAttribute("count", count);

        PrintWriter out = response.getWriter();
        Enumeration en  = request.getParameterNames();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Second Servlet </title>");
            out.println("</head>");
            out.println("<body>");



            while ( en.hasMoreElements() ) {
                String param = en.nextElement().toString();
                out.println("<h1>"+param+"="+ request.getParameter(param)+"</h1>");
            }

            out.println("<h1>" +count+"</h1>");
            out.println("<h1>" +request.getAttribute("count")+"</h1>");
            out.println("<h1>" +request.getParameter("p1")+"</h1>");
            out.println("<img src='images/ibm.jpg'>");
            out.println("<h1>Servlet image 2</h1>");
            out.println("<img src='"+request.getContextPath()+"/images/oracle.jpg'>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }

    }

}
