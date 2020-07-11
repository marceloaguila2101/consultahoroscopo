package cl.desafiolatam.dao.impl;

import java.sql.Connection;

import cl.desafiolatam.dao.LoginDao;
import cl.desafiolatam.model.Usuario;
import cl.desafiolatam.utils.DaoUtil;

public class LoginDaoImpl implements LoginDao{

	@Override
	public boolean validaLogin(Usuario usuario) throws Exception {
		// TODO Auto-generated method stub
		Connection con = DaoUtil.getConnection("jdbc/horoscopo");
		return true;
	}

	@Override
	public boolean loginUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

}
