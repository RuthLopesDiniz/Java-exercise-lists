package Lista01;
/*Arlo participou de um jogo noturno de pôquer organizado pelos seus amigos. Ás 23 horas, ele já havia perdido R$ 65 desde o início. Entre 23 horas e 2 horas, 
 * ele ganhou R$: 120. Então, nas próximas três horas, ele perdeu mais R$: 45. Nas quatro horas finais do jogo, ele ganhou R$: 30. 
 * Quanto Arlo ganhou ou perdeu durante o jogo?
*/
public class aula24 {

	public static void main(String[] args) {
		double perda1 = 65;
		double ganho1 = 120;
		double perda2= 45;
		double ganho2 = 30;
		
		double totalGanhos = (ganho1 + ganho2) - (perda1 + perda2);
		
		System.out.println("Arlo ganhou " + String.format("%.2f", 
							(totalGanhos)) + " durante o jogo");

	}

}
