package entidade;

import java.util.ArrayList;
import java.util.List;

public class Estante {
	
	private String tipo;
	private String cor;
	private String tamanho;
	private List<Livro> listaLivros;
	
	public Estante(){
		this.listaLivros = new ArrayList<Livro>();
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public List<Livro> getListaLivros() {
		return listaLivros;
	}

	public void setListaLivros(List<Livro> listaLivros) {
		this.listaLivros = listaLivros;
	}

}
