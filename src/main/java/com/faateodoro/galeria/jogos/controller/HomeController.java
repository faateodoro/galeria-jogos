package com.faateodoro.galeria.jogos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.faateodoro.galeria.jogos.model.Genero;
import com.faateodoro.galeria.jogos.model.Jogo;
import com.faateodoro.galeria.jogos.repository.GeneroRepository;
import com.faateodoro.galeria.jogos.repository.JogoRepository;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private JogoRepository jogoRepository;
	
	@Autowired
	private GeneroRepository generoRepository;

	public HomeController(JogoRepository jogorepository, GeneroRepository generoRepository) {
		this.jogoRepository = jogorepository;
		this.generoRepository = generoRepository;
	}

	@GetMapping
	public String home(Model model) {
		
		List<Jogo> todosJogos = jogoRepository.findAll();
		List<Genero> todosGeneros = generoRepository.findAll();
		model.addAttribute("todosJogos", todosJogos);
		model.addAttribute("todosGeneros", todosGeneros);
		return "home/home";
	}

}

//	//Esse código vai sair logo
//	private void ignorarEsseExtracted() {
//		// Criando as variáveis para o banco
//		Genero rpg = new Genero("RPG");
//		Genero luta = new Genero("Figting Game");
//		Genero metroidvania = new Genero("Metroidvania");
//		// Salvando os dados no banco
//		generoRepository.save(rpg);
//		generoRepository.save(luta);
//		generoRepository.save(metroidvania);
//		
//		// Pegando os dados do banco
//		List<Genero> generos = generoRepository.findAll();
//		
//		// Variáveis dos jogos com os dados do banco
//		Jogo darksouls3 = new Jogo("Dark Souls 3", generos.get(0), "From Software", Plataforma.PLAYSTATION_4, 
//				"Jogo bem foda.", "https://savassigames.com.br/wp-content/uploads/2017/10/Dark-Souls-3-The-Fire-Fades-Edition-PS4.jpg");
//		Jogo sfv = new Jogo("Street Fighter V", generos.get(1), "Capcom", Plataforma.PC, "Jogo offline foda, online lixo",
//				"https://bdjogos.com.br/capas/1632-Street-Fighter-V-capa-1.jpg");
//		Jogo hollowknight = new Jogo("Hollow Knight", generos.get(2), "Team Cherry", Plataforma.PLAYSTATION_4, 
//				"Metroidvania bem decente", "https://images-americanas.b2w.io/produtos/01/00/img/92011/1/92011173_1GG.jpg");
//		
//		// Código salvando os jogos
//		jogoRepository.save(darksouls3);
//		jogoRepository.save(sfv);
//		jogoRepository.save(hollowknight);
//	}
