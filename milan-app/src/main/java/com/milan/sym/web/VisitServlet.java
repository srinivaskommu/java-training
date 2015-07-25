package com.milan.sym.web;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class VisitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VisitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	{
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
   
  
    
	    String username=request.getParameter("username");  
	    String password=request.getParameter("password");  
	          
	    if(VisitServlet.validate(username, password)){  
	        RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");  
	        rd.forward(request,response);  
	    }  
	    else{  
	        out.print("Sorry username or password error");  
	        RequestDispatcher rd=request.getRequestDispatcher("/Home.jsp");  
	        rd.include(request,response);  
	    }  
	          
	    out.close();
	}
	    }

	private static boolean validate(String username, String password) {
		if(username.equals("pavani") && password.equals("srinivas"))
		{
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}  
	}  



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	