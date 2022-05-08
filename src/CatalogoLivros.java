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
		if(posicao < 0 || posicao > livros.size()){
			System.out.println("Livro em posição inexistente");
			return false;
		}else{
			livros.remove(posicao);
		return true;
		}
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
