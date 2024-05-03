package Lista01;
/*Os seis filhos de Janey estão colorindo ovos para a Páscoa. Ela comprou um total de 5 dúzias de ovos para todas as crianças 
 * colorirem. Supondo que cada criança receba a mesma quantidade de ovos, quantos ovos cada criança recebeu?
*/
public class aula3 {

	public static void main(String[] args) {
		int totalOvos = 5*12;
		
		int totalPorCrianca = totalOvos/6;
		
		System.out.println("Total de ovos por criança: " + totalPorCrianca);

	}

}
