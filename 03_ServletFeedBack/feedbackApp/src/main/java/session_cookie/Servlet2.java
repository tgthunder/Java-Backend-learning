package session_cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.invoke.VarHandle;
import java.net.CookieStore;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// Displying cookie on user's computer
		
		resp.setContentType("text/html");
		
		PrintWriter writer =  resp.getWriter();
		
		Cookie[]  cookies = req.getCookies();
		
		// If cookie is present then we will get array of cookies
		
		StringBuilder content =  new StringBuilder();
		boolean flag = false;
		if(cookies != null) {
			for(Cookie c: cookies)
			{
				String name = c.getName();
				if(name.equals("username"))
				{
					System.out.println("Username: " + c.getValue());
					content.append("""
							<h3>Welcome: %s</h3>
							""".formatted(c.getValue()));
					flag = true;
					
				}else if(name.equals("userid"))
				{
					content.append("""
							<h3>USerId: %s</h3>
							""".formatted(c.getValue()));
					flag = true;
				}
			}
		}
		
		
		// Get data from session obejct
		HttpSession getData =  req.getSession();
		
		String secret =(String) getData.getAttribute("secret_key");  //we get the data as an object so we need to typecast it accordingly
		
		
		content.append("""
				<h3>USer Secret Key: %s</h3>
				""".formatted(secret));
				
		System.out.println(content);
		
		if(flag)
		{
			writer.print(content);
		}else
		{
			writer.print("<h3>Cookie Not Found</h3>");
		}
	}
}
