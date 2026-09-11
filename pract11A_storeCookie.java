import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/storeCookie")
public class pract11A_storeCookie extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");

        String encodedUsername = URLEncoder.encode(username, "UTF-8");

        Cookie cookie = new Cookie("username", encodedUsername);
        cookie.setMaxAge(60 * 60 * 24);

        response.addCookie(cookie);

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h2>User Name stored successfully!</h2>");
        out.println("<a href='readCookie'>Read Cookie</a>");
    }
}