
import java.util.Scanner;

public class SistemaCatalogoLivros {

	private CatalogoLivros catalogoLivros;

	private Scanner teclado;

	public SistemaCatalogoLivros() {
		catalogoLivros = new CatalogoLivros();
		teclado = new Scanner(System.in);
	}

	public void iniciarSistema(){
		int op = -1;
		while(op != 0){
			op = menuPrincipal();
			switch(op){
			case 1:
				adicionarLivro();
				break;
			case 2:
				catalogoLivros.imprimirLivros();
				break;
			case 3:
				removerLivro();
				break;
			case 0:
				System.out.println("Finalizando o sistema");
				break;
			default:
				System.out.println("Op��o inv�lida");
				break;
			}
		}
	}

	private void removerLivro() {	
		catalogoLivros.remover(Integer.parseInt(teclado.nextLine()));	
	}

	private void adicionarLivro() {
		Livro novoLivro = new Livro();
		novoLivro.setResumo(teclado.nextLine());
		novoLivro.setTitulo(teclado.nextLine());
		novoLivro.setAutor(teclado.nextLine());
		novoLivro.setNumPaginas(Integer.parseInt(teclado.nextLine()));
		novoLivro.setPalavrasChave(teclado.nextLine());
		catalogoLivros.adicionar(novoLivro);
	}

	public int menuPrincipal(){
		System.out.println("---------------MENU-----------------");
		System.out.println("  1 - Adicionar Livro");
		System.out.println("  2 - Imprimir Livros");
		System.out.println("  3 - Remover livro (por posi��o)");
		System.out.println("  0 - Sair");
		System.out.println("------------------------------------");
		System.out.println("Digite op��o:");
		int op = Integer.parseInt(teclado.nextLine());
		
		return op;

	}

}
