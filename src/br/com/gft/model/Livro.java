package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class Livro extends Produto implements Imposto {
	private String autor;
	private String tema;
	private int qtdPag;

	public Livro(String nome, double preco, int qtd) {
		super(nome, preco, qtd);
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;

	}

	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}

	@Override
	public void produto() {

	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}

	public double calculaImposto() {
		if (tema.equals("educativo")) {
			System.out.println("Livro educativo não tem imposto: " + nome);
			return 0;
		} else {
			double aux;
			aux = preco * 0.10;
			System.out.println("R$ " + aux + " de imposto sobre o livro " + nome);
			return preco;
		}
	}

}
