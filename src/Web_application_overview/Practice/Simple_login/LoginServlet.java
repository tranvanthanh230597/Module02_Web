package Web_application_overview.Practice.Simple_login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String pass     = request.getParameter("password");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>oke</h1>");
        if ("admin".equals(userName)){
            if ("admin".equals(pass)){
                writer.println("<h1>Welcome "+userName+" to website</h1>");
            }
            else {
                writer.println("<h1>Login "+userName+" to website Error</h1>");
            }
        }
        else{
            writer.println("<h1> ERROR</h1>");
        }

        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
