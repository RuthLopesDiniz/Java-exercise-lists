package Lista01;
/*Antônia comprou um suéter que normalmente custa R$: 86, incluindo as taxas. Quando ela foi até o caixa, descobriu que 
 * o suéter estava sendo vendido pela metade do preço. Além disso, ela usou um cartão presente de R$: 20 para ajudar 
 * no pagamento. 
 * Quanto ela gastou para comprar o suéter?
*/
public class Aula7 {

	public static void main(String[] args) {
		double valorSueter = 86.00;
		double valorComDesconto = valorSueter / 2;
		
		double cartaoPresente = 20.00;
		
		double valorFinal = valorComDesconto - cartaoPresente;
		
		System.out.println("Ela gastou R$ " + String.format("%.2f", 
				
				(valorFinal)) + " para comprar o suéter.");
		

	}

}
