package Lista01;
/*Um restaurante possui 5 mesas que comportam 8 pessoas cada, 16 mesas comportam 6 cada e 11 que comportam 4 cada. 
 * Qual é a capacidade total de todas as mesas do restaurante?
*/
public class aula5 {

	public static void main(String[] args) {
		int mesasPra8 = 5;
		int mesaPra6 = 16;
		int mesaPra4 = 11;
		
		int capacidadeMesasPra8 = mesasPra8 * 8;
		int capacidadeMesasPra6 = mesaPra6 * 6;
		int capacidadeMesasPra4 = mesaPra4 * 4;
		
		int capacidadeTotal = capacidadeMesasPra8+
				capacidadeMesasPra6+capacidadeMesasPra4;
		System.out.println("Capacitade total de todas as "
				+ "mesas do restaurante: " + capacidadeTotal);

	}

}
