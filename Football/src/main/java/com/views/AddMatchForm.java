package com.views;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddMatchForm")
public class AddMatchForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		ArrayList<String> list=(ArrayList<String>) request.getAttribute("errors");
		
		out.println("<html>");
		out.println("<body>");
		if(list!=null) {
			Iterator<String> itr=list.iterator();
			out.println("<ul>");
			while(itr.hasNext()) {
			out.println("<li>"+itr.next()+"</li>");
		}
		out.println("</ul>");
		}
		out.println("<h2>Add Match Details </h2>");
		out.println("<form action='AddMatchCont' method='post'>");
		out.println("Title<input type='text' name='title'><br/><br/>");
		out.println("Place<input type='text' name='place'><br/><br/>");
		out.println("Match Date<input type='datetime' name='date'><br/><br/>");
		out.println("<input type='submit' name='Submit'>");
		out.println("</form></body></html>");
		//response.getWriter();//.append("Served at: ").append(request.getContextPath());
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	

	}

}
