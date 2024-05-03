package Lista01;
/*Duas barras de chocolate geralmente são vendidas por 90 centavos. Esta semana, há uma promoção de três barras por R$: 1,05. Heidi comprou tantas barras que acabou 
 * economizando R$:5,40 em comparação ao preço normal. Quantas barras de chocolate ela comprou?
*/
public class aula35 {

	public static void main(String[] args) {
		double precoUnidadebarra = 0.90 / 2;
		double precoPromocao3barras = 1.05 / 3;
		double economia = precoUnidadebarra - precoPromocao3barras;
		double economiaHeide = 5.40;
		
		double compraHeide = economiaHeide / economia;
		System.out.println("Heide comprou " + String.format
						  ("%.0f", compraHeide) + " barras de chocolate.");
		
	}

}
