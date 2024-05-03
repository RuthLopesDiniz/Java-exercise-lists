package Lista01;
/*Yianni acabou de comprar uma casa financiada pelo preço de R$: 385. O valor mensal do financiamento para cobrir o capital 
 * e os juros serão de R$: 1.800 por mês por 30 anos. Quando ele terminar de pagar tudo, quanto Yianni pagará a 
 * mais em juros acima do valor da casa?
*/
public class aula22 {

	public static void main(String[] args) {
		double valorCasa = 385000;
		double valorMensal = 1800;
		double prazoEmAnos = 30;
		
		double juros = (valorMensal * 12 * prazoEmAnos) - valorCasa;
		System.out.println("Quando ele terminar de pagar tudo, pagará a \r\n"
				+ "mais em juros o valor de R$ " + String.format("%.2f", (juros)));
	}

}
