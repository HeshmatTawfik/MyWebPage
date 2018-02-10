import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import javax.servlet.*;
import javax.servlet.http.*;


public class Admin extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("email");
        String password=request.getParameter("pass");
     /*   Scanner in = new Scanner(System.in);

        for(int i = 0; i<3; i++){
            System.out.println("put a");
            String a=in.nextLine();
            System.out.println(" put b");
            String b=in.nextLine();
            Validate.map.put(a, b);

            System.out.println(Validate.map.put(a,b));




        }*/

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String users=Collections.singletonList(Validate.map).toString();
        String separator = System.getProperty( "line.separator" );
        out.println("Welcome Admin "+username);
        out.print("<a href='Adminn.jsp'>Click here to go to Users Control page</a>");
        out.println("<jsp:include page='Adminn.jsp' />");
        PrintWriter out2 = response.getWriter();
        out2.print(separator+users); // method 1









    }

}