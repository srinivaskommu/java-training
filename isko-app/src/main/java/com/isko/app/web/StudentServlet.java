package com.isko.app.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.isko.app.domain.Student;
import com.isko.app.service.StudentService;
import com.isko.app.service.StudentServiceImpl;

public class StudentServlet extends HttpServlet 
{
//	@Autowired
//	StudentService studentsService;
//	

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		
		System.out.println("Welcome"+req.getAttribute("userName"));
		
		System.out.println("Welcome"+req.getAttribute("userId"));
		
		//call studentService layer
		
		List<Student> result = new ArrayList<Student>();
		Student st1 = new Student("rob", "low", null);
		result.add(st1);
				
				//studentsService.findStudentByName((String)req.getAttribute("stduentName"));
		
		resp.setContentType("text/html");// setting the content type
		PrintWriter pw = resp.getWriter();// get the stream to write the data
		pw.println("<html><body>");
		for(Student st :result)
		{
			pw.println(" First NAme" +st.getFirstName() );
			pw.println(" Last NAme" +st.getLastName() );
			pw.println(" Student Id" +st.getStudentId() );
			pw.println("</body></html>");
	
		}
		
		// writing html in the stream

		pw.close();// closing the stream
		

	}
	
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	{
		
		System.out.println("Welcome"+req.getAttribute("userName"));
		
		System.out.println("Welcome"+req.getAttribute("userId"));
		
		//call studentService layer
		
//		List<Student> result = studentsService.findStudentByName((String)req.getAttribute("stduentName"));
//		
//		resp.setContentType("text/html");// setting the content type
//		PrintWriter pw = resp.getWriter();// get the stream to write the data
//		pw.println("<html><body>");
//		for(Student st :result)
//		{
//			pw.println(" First NAme" +st.getFirstName() );
//			pw.println(" Last NAme" +st.getLastName() );
//			pw.println(" Student Id" +st.getStudentId() );
//			pw.println("</body></html>");
//	
//		}
		
		// writing html in the stream

	//	pw.close();// closing the stream
		

	}

}
