package com.faateodoro.galeria.jogos.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Jogo {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	@ManyToOne
	private Genero genero;
	private String desenvolvedora;
	@Enumerated(EnumType.STRING)
	private Plataforma plataforma;
	private LocalDate dataCompra = LocalDate.now();
	private String descricao;
	private String urlCapa;
	@Enumerated(EnumType.STRING)
	private StatusJogo statusJogo = StatusJogo.AGUARDANDO;
	
	public Jogo() {
	}
	
	public Jogo(String titulo, Genero genero, String desenvolvedora, Plataforma plataforma, String descricao, String urlCapa) {
		this.titulo = titulo;
		this.genero = genero;
		this.desenvolvedora = desenvolvedora;
		this.plataforma = plataforma;
		this.descricao = descricao;
		this.urlCapa = urlCapa;
	}

	public Long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public Genero getGenero() {
		return genero;
	}
	public String getDesenvolvedora() {
		return desenvolvedora;
	}
	public Plataforma getPlataforma() {
		return plataforma;
	}
	public LocalDate getDataCompra() {
		return dataCompra;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getUrlCapa() {
		return urlCapa;
	}
	public StatusJogo getStatusJogo() {
		return statusJogo;
	}
	
	
}
