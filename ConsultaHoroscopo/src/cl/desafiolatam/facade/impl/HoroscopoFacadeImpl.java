package cl.desafiolatam.facade.impl;

import cl.desafiolatam.facade.HoroscopoFacade;
import cl.desafiolatam.model.Usuario;
import cl.desafiolatam.service.LoginService;
import cl.desafiolatam.service.impl.LoginServiceImpl;

public class HoroscopoFacadeImpl implements HoroscopoFacade{
	
	private LoginService loginService = null;
	
	
	
	public HoroscopoFacadeImpl() {
		super();
		// TODO Auto-generated constructor stub
		loginService = new LoginServiceImpl();
	}

	@Override
	public boolean validaLogin(Usuario usuario) throws Exception {
		// TODO Auto-generated method stub
		return loginService.validaLogin(usuario);
	}

	@Override
	public boolean loginUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

}
