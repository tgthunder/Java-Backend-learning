package feedbackApp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/feedback")
public class Feedback extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String mail = req.getParameter("email");
		
		String number = req.getParameter("contact");
		
		String feed = req.getParameter("feed");
		
		System.out.println("email: "+mail+"\n"+"number: "+number+"\n"+"Feedback: "+feed);
		resp.setContentType("text/html");
		
		PrintWriter writer =  resp.getWriter();
		
		writer.print("Form Has been SuccessFully Submitted!");
		// get the request 
		
		// proccess the data 
		
		// generate the response
		
	}
}
