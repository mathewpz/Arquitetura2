package br.usjt.hellospringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.hellospringboot.model.Clima;
import br.usjt.hellospringboot.repository.ClimasRepository;

@Controller
public class ClimasController {
	@Autowired
	private ClimasRepository climasRepo;

	@GetMapping("/previsao")
	public ModelAndView listarAlunos() {
		ModelAndView mv = new ModelAndView("previsao_do_tempo");
		List<Clima> climas = climasRepo.findAll();
		mv.addObject("climas", climas);
		return mv;
	}
}