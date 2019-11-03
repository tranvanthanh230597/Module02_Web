package Web_application_overview.Exercise.Discount_Calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountCalculatorServlet", urlPatterns = "/discount")
public class DiscountCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float discount = Float.parseFloat(request.getParameter("discount"));
        float discountAmount = (float) (price * discount * 0.1);
        writer.println("<html>");
            writer.println("<h1>Description: " + description+ "</h1>");
            writer.println("<h1>Price: " + price+ "</h1>");
            writer.println("<h1>Piscount: " + discount+ "</h1>");
            writer.println("<h1>Discount Amount: " + discountAmount+ "</h1>");
        writer.println("</html");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
