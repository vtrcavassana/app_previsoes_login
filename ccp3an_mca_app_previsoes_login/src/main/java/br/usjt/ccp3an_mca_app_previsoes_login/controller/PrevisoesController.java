package br.usjt.ccp3an_mca_app_previsoes_login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.ccp3an_mca_app_previsoes_login.model.Previsao;
import br.usjt.ccp3an_mca_app_previsoes_login.repository.PrevisoesRepository;
import br.usjt.ccp3an_mca_app_previsoes_login.service.PrevisoesService;

@Controller
public class PrevisoesController {
	// a injeção de dependência ocorre aqui
	@Autowired
	private PrevisoesService previsoesService;

	@GetMapping("/previsoes")
	public ModelAndView listarPrevisoes() {
		// passe o nome da página ao construtor
		ModelAndView mv = new ModelAndView("lista_previsoes");
		// para modelar o formulário
		mv.addObject(new Previsao());
		// Busque a coleção com o repositório
		List<Previsao> previsoes = previsoesService.listarTodos();
		// adicione a coleção ao objeto ModelAndView
		mv.addObject("previsoes", previsoes);
		// devolva o ModelAndView
		return mv;
	}

	@PostMapping("/previsoes")
	public String salvar(Previsao previsao) {
		previsoesService.salvar(previsao);
		return "redirect:/previsoes";
	}
}