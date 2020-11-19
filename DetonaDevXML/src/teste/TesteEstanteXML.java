package teste;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import entidade.Estante;
import entidade.Livro;

public class TesteEstanteXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XStream xstream = new XStream(new DomDriver());
		
		Estante estante = new Estante();
		
		Livro l1 = new Livro();
		Livro l2 = new Livro();
		Livro l3 = new Livro();
		
		List<Livro> listaLivrosAqui = new ArrayList<Livro>(); 
		
		estante.setCor("Marrom");
		estante.setTamanho("GG");
		estante.setTipo("Retilíneo");
		
		l1.setTitulo("Kamen Rider The First");
		l1.setAutor("Shotaro Ishinomori");
		l1.setClassificacao("+15");
		l1.setAnoLancamento(2005);
		
		l2.setTitulo("One Piece");
		l2.setAutor("Eiichiro Oda");
		l2.setClassificacao("Livre");
		l2.setAnoLancamento(1997);
		
		l3.setTitulo("Edens Zero");
		l3.setAutor("Hiro Mashima");
		l3.setClassificacao("+21");
		l3.setAnoLancamento(2018);
		
		listaLivrosAqui.add(l1);
		listaLivrosAqui.add(l2);
		listaLivrosAqui.add(l3);
		
		estante.setListaLivros(listaLivrosAqui);
		
		System.out.println(xstream.toXML(estante));

	}

}
