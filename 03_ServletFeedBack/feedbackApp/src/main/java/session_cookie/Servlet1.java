package session_cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import org.apache.catalina.tribes.util.UUIDGenerator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/servlet1")
public class Servlet1  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		// creating a cookie
		resp.setContentType("text/html");
		
		String username  = "Sudarshan";
		String userId = "123419";
		
		
		Cookie cookie = new Cookie("username" , username);
		var cookie1 = new Cookie("userid" , userId);
		
		// Session manageent using httpsession obejct
		
		HttpSession session =  req.getSession();
		session.setAttribute("secret_key", UUID.randomUUID().toString());
		
		session.setMaxInactiveInterval(10*60); // If user will not visit within 10 min then this variable will be Inactivated
		
		cookie.setMaxAge(60*10);
		cookie1.setMaxAge(60*5);
		resp.addCookie(cookie);
		resp.addCookie(cookie1);
		
		PrintWriter writer =  resp.getWriter();
		
		writer.print("<h2>Cookie created SuccessFully!</h2>");

	}
}
