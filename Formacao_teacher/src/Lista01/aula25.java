package Lista01;
/*Clarissa comprou um diamante por R$: 1.000 e o vendeu para André por R$:1.100. Um mês depois, André precisou de dinheiro, então, 
 * vendeu o diamante para Clarissa por R$: 900. No entanto, alguns meses depois, ele recebeu uma herança inesperada e 
 * comprou o diamante de novo por R$:1.200. Qual foi o lucro total de Clarissa nessas negociações?
*/
public class aula25 {

	public static void main(String[] args) {
		double clarissaCompra1 = 1000;
		double andreCompra1 = 1100;
		double clarissaCompra2 = 900;
		double andreCompra2 = 1200;
		
		double lucroClarissa = (andreCompra1 -clarissaCompra1 ) 
							+ (andreCompra2- clarissaCompra2);
		System.out.println("O lucro de clarissa foi de R$ " + 
							String.format("%.2f" , lucroClarissa) );

	}

}
