package Lista01;
/*Jim comprou quatro caixas de cereal na promoção. Uma das caixas pesa 10 onças e as restantes pesam 16 onças cada. 
 * Quantas onças de cereal ele comprou no total?
*/
public class aula11 {

	public static void main(String[] args) {
		int boxP = 10;
		int boxG = 16;
		
		int qtdBoxP = 1;
		int qtdBoxG = 3;
		
		int qtdTotalOncaP = boxP*qtdBoxP;
		int qtdTotalOncaG = boxG*qtdBoxG;
		
		int qtdTotal = qtdTotalOncaP + qtdTotalOncaG;
		
		System.out.println("Jim comprou " + qtdTotal + " onça de cereal.");
	}

}
