package cl.desafiolatam.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.desafiolatam.facade.HoroscopoFacade;
import cl.desafiolatam.facade.impl.HoroscopoFacadeImpl;
import cl.desafiolatam.model.Usuario;

@WebServlet("/")
public class LoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HoroscopoFacade horoscopoFacade = null;
	
	

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		horoscopoFacade = new HoroscopoFacadeImpl();
	}



	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/login.jsp").forward(req, resp);
	}



	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Usuario usuario = new Usuario();
		usuario.setUser(req.getParameter("usuario"));
		usuario.setPassword(req.getParameter("password"));
		try {
			horoscopoFacade.validaLogin(usuario);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		req.getRequestDispatcher("/consultaHoroscopo.jsp").forward(req, resp);
	}
	
	
}
