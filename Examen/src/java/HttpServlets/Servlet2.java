
package HttpServlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet2 extends HttpServlet {
String lado1,lado2;
int l1, l2, resultado;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        //lado1=request.getParameter("lado1");
        //lado2=request.getParameter("lado2");
        l1=request.getIntHeader("lado1");
        l2=request.getIntHeader("lado2");
        resultado=l1*l2;
        
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>'El area del rectangulo es:'+ resultado</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
