package Lista01;
/*Juntos, um livro e um jornal custam R$: 11. O livro custa R$: 10 a mais que o jornal. Quantos jornais você poderia 
 * comprar pelo mesmo preço do livro?
*/
public class aula21 {

	public static void main(String[] args) {
		double jornal = 0.50;
		double livro = 10.50;
		
		double QtsJornaisPoderiaComprar = livro / jornal;
		
		System.out.println("Quantos jornais você poderia "
				+ "comprar pelo mesmo preço do livro?\r\n "
				+ String.format("%.0f", (QtsJornaisPoderiaComprar)));

	}

}
