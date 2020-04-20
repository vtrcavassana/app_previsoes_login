package br.usjt.ccp3an_mca_app_previsoes_login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.ccp3an_mca_app_previsoes_login.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Usuario findOneByLoginAndSenha(String login, String senha);
}