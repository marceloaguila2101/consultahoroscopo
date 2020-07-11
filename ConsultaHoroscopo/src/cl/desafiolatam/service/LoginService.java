package cl.desafiolatam.service;

import cl.desafiolatam.model.Usuario;

public interface LoginService {
	public boolean validaLogin(Usuario usuario) throws Exception;
	public boolean loginUsuario(Usuario usuario);
}
