import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CalculateServlet", value = "/CalculateServlet")
public class CalculateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int first = Integer.parseInt(request.getParameter("first"));
        int second = Integer.parseInt(request.getParameter("second"));
        int chose = Integer.parseInt(request.getParameter("chose"));
        String exprestion;
        switch (chose){
            case 1:
                exprestion = "+";
                break;
            case 2:
                exprestion = "-";
                break;
            case 3:
                exprestion = "*";
                break;
            default:
                exprestion = "/";
                break;
        }
        Calculate calculate = new Calculate(first, second);
        request.setAttribute("exprestion", exprestion);
        request.setAttribute("calculate", calculate);
        request.setAttribute("chose", chose);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/calculato.jsp");
        dispatcher.forward(request, response);
    }
}
