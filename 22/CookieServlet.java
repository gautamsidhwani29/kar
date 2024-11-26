import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Get user input from form
        String userName = request.getParameter("username");
        String email = request.getParameter("email");

        // Create and add the cookie with the email
        Cookie userCookie = new Cookie("userEmail", email);
        response.addCookie(userCookie);

        // Set content type for response
        response.setContentType("text/html");

        // Send the response back with user's name and email
        response.getWriter().println("<p>Cookie with email stored!</p>");
        response.getWriter().println("<p>Name: " + userName + "</p>");
        response.getWriter().println("<p>Email: " + email + "</p>");
    }
}
