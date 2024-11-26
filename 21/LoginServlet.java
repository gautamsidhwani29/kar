import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final String USERNAME = "admin"; // Hardcoded username
    private static final String PASSWORD = "1234"; // Hardcoded password

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve username and password from the form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Authentication logic
        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            out.println("<h1>Welcome, " + username + "!</h1>");
        } else {
            out.println("<h1>Invalid username or password.</h1>");
           
        }

        out.close();
    }
}
