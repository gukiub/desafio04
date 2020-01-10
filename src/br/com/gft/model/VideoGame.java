package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto{
	private String marca;
	private String modelo;
	private boolean isUsado;
	
	public VideoGame(String nome, double preco, int qtd) {
		super(nome, preco, qtd);
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}
	

	@Override
	public void produto() {
		
	}
	
	public double calculaImposto() {
		if (isUsado == true) {
			double aux = 0;
			aux = preco * 0.25;
			System.out.println("Imposto " + nome + " " + modelo + " usado, R$ " + aux);
			return preco;
		} else {
			double aux = 0;
			aux = preco * 0.45;
			System.out.println("Imposto " + nome + " " + modelo + " R$ " + aux);
			return preco;
		}
	}
	
}
