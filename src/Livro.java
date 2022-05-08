
public class Livro {
	private String resumo;
	private String titulo;
	private String autor;
	private int numPaginas;
	private String palavrasChave;

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    public void setPalavrasChave(String palavrasChave) {
        this.palavrasChave = palavrasChave;
    }
    
    public void mostrarDados() {
    	System.out.println("Resumo: " + this.resumo);
		System.out.println("Título: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		System.out.println("Número de Páginas: " + this.numPaginas);
		System.out.println("Palavras-chave: " + this.palavrasChave);	
    }
}
