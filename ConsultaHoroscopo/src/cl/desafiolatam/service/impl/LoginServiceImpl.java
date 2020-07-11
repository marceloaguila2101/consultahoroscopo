package cl.desafiolatam.service.impl;

import cl.desafiolatam.dao.LoginDao;
import cl.desafiolatam.dao.impl.LoginDaoImpl;
import cl.desafiolatam.model.Usuario;
import cl.desafiolatam.service.LoginService;

public class LoginServiceImpl implements LoginService{
	
	private LoginDao loginDao = null;

	public LoginServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
		loginDao = new LoginDaoImpl();
	}

	@Override
	public boolean validaLogin(Usuario usuario) throws Exception {
		// TODO Auto-generated method stub
		return loginDao.validaLogin(usuario);
	}

	@Override
	public boolean loginUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

}
