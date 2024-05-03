package Lista01;
/*Duas barras de chocolate geralmente são vendidas por 90 centavos. Esta semana, há uma promoção de três barras 
 * por R$:1,05. Quanto você poderá economizar em uma única barra comprando a promoção das três barras em vez de 
 * compras as duas?
*/
public class aula16 {

	public static void main(String[] args) {
		double valorUnitarioKit2barras = 0.90 /2;
		double valorUnitario3Kitbarras = 1.05 /3;
		
		double economia = valorUnitarioKit2barras - valorUnitario3Kitbarras;
		
		System.out.println(String.format("%.2f", (economia)) + " é o "
				+ "valor economizado em uma única barra comprando "
				+ "a promoção das três barras em vez "
				+ "de compras as duas.");

	}

}
