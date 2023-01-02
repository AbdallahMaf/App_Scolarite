package com.groupeisi.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.groupeisi.dao.UserDaoImpl;
import com.groupeisi.entities.User;

/**
 * Servlet implementation class UserSerlet
 */
@WebServlet("/UserSerlet")
public class UserSerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet() 
     */
    public UserSerlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		/*RequestDispatcher dispatcher = request.getRequestDispatcher("/webapp/index.jsp");
		dispatcher.forward(request, response);*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		User user = new User(0, firstname, lastname, email, password);
		
		UserDaoImpl userDao = new UserDaoImpl();
		String result = userDao.insert(user); 
		response.getWriter().print(result);
		
		/*RequestDispatcher dispatcher = request.getRequestDispatcher("/webapp/Userdetails.jsp");
		dispatcher.forward(request, response);*/
	}

}
