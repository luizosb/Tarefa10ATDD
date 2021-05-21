package req01.casos;

import java.util.ArrayList;
import java.util.List;

import entidades.Livro;

public class REQ01 {
	
	private List<Livro> listaLivros = new ArrayList<>();
	
	public Livro ct01CadastroComSucessoDeLivros(Livro livro) {
		listaLivros.add(livro);
		
		return livro;
		
	}
	
	public String ct02CadastroComIsbnJaCadastrado(Livro livro) {
		
		for(Livro l : listaLivros) {
			if(l.getIsbn().equals(livro.getIsbn())) {
				System.out.println("Não é possível adicionar pois ISBN já existe.");
			} else {
				listaLivros.add(livro);
			}
		}
		return livro.getIsbn();
	}
	
	public Livro ct03CadastroComIsbnEmBranco(Livro livro) {
		
		livro.setIsbn("");
		livro.setAutor("Machado de Assis");
		livro.setTitulo("Dom Casmurro");
		
		for(int i=0; i < listaLivros.size(); i++) {
			if(listaLivros.get(i).getIsbn().equals(livro.getIsbn())) {
				System.out.println("Não é possível adicionar pois ISBN já existe.");
			} else if (listaLivros.get(i).getIsbn().isEmpty()){
				System.out.println("Não é possível adicionar pois ISBN está em branco.");
			} else {
				listaLivros.add(livro);
			}
		}
		return livro;
	}
	

}
