import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readCookie")
public class pract11A_readCookie extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Cookie cookies[] = request.getCookies();
        String username = "Cookie Not Found";

        if (cookies != null) {
            for (Cookie cookie : cookies) {

                if (cookie.getName().equals("username")) {
                    username = URLDecoder.decode(cookie.getValue(), "UTF-8");
                    break;
                }
            }
        }

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h2>Stored User Name</h2>");
        out.println("<h3>User Name: " + username + "</h3>");
    }
}