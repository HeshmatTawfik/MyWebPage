import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/Adminn.jsp")
public class Admin extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {



        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        RequestDispatcher rs=request.getRequestDispatcher("AdminDashboard.jsp");
        rs.include(request,response);

        out.println("<jsp:include page='AdminDashboard.jsp' />");











    }

}