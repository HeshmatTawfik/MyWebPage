import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.util.Date;

public class Welcome extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("email");

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();


            out.println("Welcome MR " + " " + username);
            out.println("Your login time:" + " " + new Date());

    }
}