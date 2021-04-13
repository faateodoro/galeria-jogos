package com.faateodoro.galeria.jogos.model;

import java.time.LocalDate;

public class Jogo {
	private Long id;
	private Genero genero;
	private String desenvolvedora;
	private Plataforma plataforma;
	private LocalDate dataCompra;
	private String descricao;
	private String urlCapa;
	private StatusJogo statusJogo;
	
	public Long getId() {
		return id;
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
