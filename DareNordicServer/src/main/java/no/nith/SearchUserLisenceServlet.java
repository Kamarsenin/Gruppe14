package no.nith;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;


public class SearchUserLisenceServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String query = req.getParameter("q");
		
		ArrayList<UserLisence> userLisences;
		
		if (query != null && query.length() > 0) {
			userLisences = new SearchUserLisenceDAO().getUserLisence(query); //Fetch everything with name like query
		} else {
			//Sett inn annen DAO
			userLisences = new SearchUserLisenceDAO().getUserLisence(); //Fetch everything
		}
		
		// 1. Henter landene
		//UserDAO userDAO = new UserDAO();
		//ArrayList<User> users = userDAO.getUsers();
		
		// 2. Tilgjengeligj�r landene for JSP-siden i form av en attributt
		// ved navn "user". Kan hente denne JSP-siden med ${user}
		req.setAttribute("userLisences", userLisences);
		
		// 3. Sier ifra om at JSP skal ta over ved � spesifisere fil
		RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/userLisence.jsp");
		
		// ... og leverer responsen basert p� dataene vi har klargjort (countries)
		view.forward(req, resp);		
	}
}
