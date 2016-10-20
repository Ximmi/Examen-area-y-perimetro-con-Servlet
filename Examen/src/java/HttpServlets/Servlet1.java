
package HttpServlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Servlet1 extends HttpServlet {
String radio;
int rad;
double resultado;
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        //radio=request.getParameter("radio");
        rad=request.getIntHeader("radio");
        resultado= rad*6.24;
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>'El perimetro del circulo es: ' +resultado</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
