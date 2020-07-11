package cl.desafiolatam.dao;

import cl.desafiolatam.model.Usuario;

public interface LoginDao {
	public boolean validaLogin(Usuario usuario) throws Exception;
	public boolean loginUsuario(Usuario usuario);
}
