package com.aruvi;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
  
public class HomePage extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
    String n=request.getParameter("uname");  
    String p=request.getParameter("pwd");
    
          
    if(validate(n, p)){
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("welcome");
        requestDispatcher.forward(request,response);  
    }  
    else{  
        out.print("Sorry username or password error");  
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("index.html");  
        requestDispatcher.include(request,response);  
    }  
          
    out.close();  
    }

	boolean validate(String uname, String password) {
		boolean loginValue = false;
		if (uname.equals("xsitlak") && password.equals("12345")) loginValue = true;
		else if (uname.equals("xbalvid") && password.equals("23456")) loginValue = true;
		
		return loginValue;
	}
	
}  