package com.groupeisi.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.groupeisi.dao.UserDoaImpl;
import com.groupeisi.entities.User;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/userservlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		User user = new User(firstname, lastname, email, password);
		
		UserDoaImpl userDao = new UserDoaImpl();
		String result = userDao.create(user); 
		response.getWriter().print(result);
	}

}
