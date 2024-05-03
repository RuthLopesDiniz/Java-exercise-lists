package Lista01;
/*Arturo trabalhou 40 horas por semana recebendo R$: 12 por hora. Ele então, recebeu um aumento de R$ 1 por hora e 
 * trabalhou 30 horas semanais. Qual foi a quantia a mais de dinheiro que ele recebeu referente a primeira semana de 
 * trabalho em relação a segunda?
*/
public class aula4 {

	public static void main(String[] args) {
		double primeiraSemana = 40*12;
		double segundaSemana = 30*13;
		
		double quantiaAmais = primeiraSemana - segundaSemana;

		System.out.println("Quantia a mais de dinheiro recebida referente a "
				+ "primeira semana de trabalho em relação "
				+ "a segunda: R$ " + String.format("%.2f", (quantiaAmais)));
	}

}
