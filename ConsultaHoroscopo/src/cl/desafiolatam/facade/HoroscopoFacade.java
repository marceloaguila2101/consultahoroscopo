package cl.desafiolatam.facade;

import cl.desafiolatam.model.Usuario;

public interface HoroscopoFacade {
	public boolean validaLogin(Usuario usuario) throws Exception;
	public boolean loginUsuario(Usuario usuario);
}
