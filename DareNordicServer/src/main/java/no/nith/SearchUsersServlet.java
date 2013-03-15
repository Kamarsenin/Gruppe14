package no.nith;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;


public class SearchUsersServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String query = req.getParameter("q");
		
		ArrayList<User> users;
		
		if (query != null && query.length() > 0) {
			users = new SearchUsersDAO().getUsers(query); //Fetch everything with name like query
		} else {
			//Sett inn annen DAO
			users = new SearchUsersDAO().getUsers(); //Fetch everything
		}
		
		// 1. Henter landene
		//UserDAO userDAO = new UserDAO();
		//ArrayList<User> users = userDAO.getUsers();
		
		// 2. Tilgjengeligjør landene for JSP-siden i form av en attributt
		// ved navn "user". Kan hente denne JSP-siden med ${user}
		req.setAttribute("users", users);
		
		// 3. Sier ifra om at JSP skal ta over ved å spesifisere fil
		RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/user.jsp");
		
		// ... og leverer responsen basert på dataene vi har klargjort (countries)
		view.forward(req, resp);		
	}
}
