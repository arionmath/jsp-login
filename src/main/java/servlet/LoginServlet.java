package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.User;
import modelsEnum.Group;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendError(HttpServletResponse.SC_FORBIDDEN);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		User u1 = new User("Ben 10", "ben10", "quatrobracos", Group.SELLER);
		User u2 = new User("Naruto Uzumaki", "naruto", "kurama", Group.MANAGER);
		User u3 = new User("Elliot Alderson", "elli", "23S@ad", Group.SELLER);
		User u4 = new User("rooter", "root", "toor", Group.ADMIN);

		List<User> lu = Arrays.asList(u1, u2, u3, u4);

		String name = request.getParameter("username");
		String password = request.getParameter("password");
		if (password == null || name == null || name.isBlank() || name.isEmpty() || password.isBlank()
				|| password.isBlank()) {
			request.getSession().setAttribute("erro", "empty fields");
			response.sendRedirect("index.jsp");
		} else {
			User userRequest = new User(name, password);
			User userFromDB = new User();
			if (lu.contains(userRequest)) {

				for (User userDB : lu) {
					System.out.println("inicio iteracao lista");
					if (userDB.equals(userRequest)) { // Pega o elemento cujo o username seja igual ao recebido
						userFromDB.setGroup(userDB.getGroup());
						userFromDB.setNome(userDB.getNome());
						userFromDB.setPassword(userDB.getPassword());
						userFromDB.setUsername(userDB.getUsername());
						System.out.println("Capturado o user da lista");
						break;

					}
				}

				Boolean test = userFromDB.getPassword().equals(userRequest.getPassword());

				if (test) {
					System.out.println("LOGIN E SENHA CORRETOS USUARIO ENTRADO");
					request.getSession().setAttribute("login", "yes");
					response.sendRedirect("dashboard.jsp");
				} else {
					request.getSession().setAttribute("erro", "wrong password!");
					response.sendRedirect("index.jsp");
					System.out.println("REDIRECIONADO");
				}
			}else {
				request.getSession().setAttribute("erro", "User not found!");
				response.sendRedirect("index.jsp");
				
			}
		}
	}

}
