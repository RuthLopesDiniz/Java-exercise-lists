package Lista01;
/*Ângela contou todas as moedas do cofrinho de sua tia. Ela contou 891 moedas de um centavo, 342 moedas de cinco centavos, 
 * 176 moedas de dez centavos e 67 moedas de vinte e cinco centavos. 
 * Quanto dinheiro tinha no cofrinho?
*/
public class aula33 {

	public static void main(String[] args) {
		double moedas1cent = 891*0.01;
		double moedas5cent = 342*0.05;
		double moedas10cent  = 176*0.10;
		double moedas25cent = 67*0.25;
		
		double totalMoedas = (moedas1cent + moedas5cent 
							+ moedas10cent + moedas25cent);
		
		System.out.println("Total de dinheiro no cofre: R$ " 
						+ String.format("%.2f", (totalMoedas)));
		
	}

}
