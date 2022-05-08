import java.util.ArrayList;
public class CatalogoLivros {
	private ArrayList<Livro> livros = new ArrayList<Livro>();
	
	public int getQuantidadeLivros(){		
		return livros.size();				
	}	
	
	public boolean adicionar(Livro novoLivro){
		livros.add(novoLivro);
		return true;		
	}
	
	public boolean remover(int posicao){
		livros.remove(posicao);
		return true;
	}
	
	public void imprimirDadosLivro(int i) {	
		livros.get(i).mostrarDados();
	}
	
	public void imprimirLivros() {
		for(int i = 0; i < getQuantidadeLivros(); i++){
			imprimirDadosLivro(i);
		}		
	}	
}
