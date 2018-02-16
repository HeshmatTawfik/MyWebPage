
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
@WebServlet("/Adminn.jsp")

public class Register extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {



        String username = request.getParameter("username");
        String pass = request.getParameter("pass");
        response.setContentType("text/html;charset=UTF-8");
        Validate.map.put(username,pass);
        PrintWriter out=response.getWriter();

      if(username!=""&&pass!=""){


          RequestDispatcher rs=request.getRequestDispatcher("Registration.jsp");
          rs.include(request,response);

              out.println("Successfully added new user "+"<pre></pre>" );

          out.println("<pre></pre>"+"All users:"+"<pre></pre>"+Validate.map.keySet());

      }
      else{
          out.println("Field Cant be empty");
          RequestDispatcher rs=request.getRequestDispatcher("Registration.jsp");
          rs.include(request,response);
      }

    }
}