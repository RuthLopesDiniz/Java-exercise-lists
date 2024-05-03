package Lista01;
/*Uma placa fixada acima de uma grande piscina lembra os nadadores que 40 extensões da piscina é igual a 1 milha. 
 * Jordy nadou 1 extensão da piscina com a velocidade de 3 milhas por hora. 
 * Quanto tempo ele levou para nadar 1 extensão da piscina?
*/
public class aula30 {

	public static void main(String[] args) {
		double milha = 40;
		double velocidade = 3;
		double qtdExtensao = milha * velocidade;
		double minuto = 60;
		
		double extensaoPorMinuto = qtdExtensao / minuto;
		 double extensao1 = extensaoPorMinuto / 4;
		 
		 System.out.println("Quanto tempo ele levou para nadar "
		 					+ "1 extensão da piscina? " + extensao1 + " segundo.");

	}

}
