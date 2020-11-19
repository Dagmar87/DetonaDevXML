package teste;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import entidade.Pessoa;

public class TesteXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		XStream xstream = new XStream(new DomDriver());
		
		Pessoa p = new Pessoa();
		
		p.setCpf("123455");
		p.setNome("Dagmar");
		p.setSexo("M");
		p.setIdade(33);
		
		System.out.println(xstream.toXML(p));
		
		String xml =  "<entidade.Pessoa>" + 
				"  <cpf>928926</cpf>" + 
				"  <nome>Agatha</nome>" + 
				"  <sexo>F</sexo>" + 
				"  <idade>25</idade>" + 
				"</entidade.Pessoa>";
		
		Pessoa nova = (Pessoa)xstream.fromXML(xml);
		
		System.out.println("CPF: " + nova.getCpf());
		System.out.println("Nome: " + nova.getNome());
		System.out.println("Sexo: " + nova.getSexo());
		System.out.println("Idade: " + nova.getIdade());
		
	}

}
