package Lista01;
/*. Se Donna levou 20 minutos para ler 60 páginas de uma história em quadrinhos de 288 páginas, quanto tempo ela levou para 
 * ler todo o livro, supondo que ela tenha lido todas as páginas na mesma velocidade?
*/
public class aula18 {

	public static void main(String[] args) {
		int tempoLeituraInicial = 20;
		int paginasParcial = 60;
		int paginasLivro = 288;
		
		
		int tempoParcial = paginasParcial/tempoLeituraInicial;
		int tempoLivroTodo = paginasLivro/tempoParcial;
		
		System.out.println("Donna levou " + tempoLivroTodo + 
						   " minutos para ler o livro todo.");
		

	}

}
