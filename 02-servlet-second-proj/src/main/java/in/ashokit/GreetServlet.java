package in.ashokit;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/GreetServlet")
public class GreetServlet extends HttpServlet {


    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        // Get the current hour
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        // Determine the appropriate greeting based on the current hour
        String greeting;
        if (hour >= 6 && hour < 12) {
            greeting = "Good Morning";
        } else if (hour >= 12 && hour < 16) {
            greeting = "Good Afternoon";
        } else if (hour >= 16 && hour < 20) {
            greeting = "Good Evening";
        } else {
            greeting = "Good Night";
        }

        // Display the greeting message
        pw.println("<html><head><title>Greeting Message</title></head><body>");
        pw.println("<h1>" + greeting + "</h1>");
        pw.println("</body></html>");

        pw.close();
    }
}


