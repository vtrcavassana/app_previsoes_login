package br.usjt.ccp3an_mca_app_previsoes_login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.ccp3an_mca_app_previsoes_login.model.Previsao;

public interface PrevisoesRepository extends JpaRepository<Previsao, Long> {
}