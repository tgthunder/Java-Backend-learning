package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.security.MessageDigest;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/third")
public class thirdServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("proccessing do get request by third servlet");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String usernameString = req.getParameter("message");
		
		// you can get lot of data from form , html page using request object
		System.out.println("dopost method is proccessing by Third Servlet");
		
		System.out.println("Message: "+usernameString);
		
		
		// sending data to browser
		resp.setContentType("text/html");   // set which data we are sending 
		PrintWriter writer =  resp.getWriter();
		
		writer.print("<h1>Record Has Been Submitted Successfully");
		
		Date date = new Date();
		writer.print("""
				
				<h3>Submitted By: %s<h3>
				<h3>Date: %s<h3>
				""".formatted(usernameString,date));
	}
	
	
	// We can modify requests according to our own way


}