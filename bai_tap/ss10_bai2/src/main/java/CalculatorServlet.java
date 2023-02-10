import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double n1 = Double.parseDouble(request.getParameter("firstNumber"));
        double n2 = Double.parseDouble(request.getParameter("secondNumber"));
        String operator = request.getParameter("operator");
        double result = 0;
        try {
            result = Calculator.calculate(n1, operator , n2);
            request.setAttribute("result", result);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}
