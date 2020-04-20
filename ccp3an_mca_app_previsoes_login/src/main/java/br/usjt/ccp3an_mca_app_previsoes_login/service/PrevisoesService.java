package br.usjt.ccp3an_mca_app_previsoes_login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.ccp3an_mca_app_previsoes_login.model.Previsao;
import br.usjt.ccp3an_mca_app_previsoes_login.repository.PrevisoesRepository;

@Service
public class PrevisoesService {
	@Autowired
	private PrevisoesRepository previsoesRepo;

	public void salvar(Previsao previsao) {
		previsoesRepo.save(previsao);
	}

	public List<Previsao> listarTodos() {
		return previsoesRepo.findAll();
	}
}