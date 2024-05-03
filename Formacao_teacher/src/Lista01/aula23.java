package Lista01;
/*A distância entre Nova York (leste) e San Diego (oeste) é de aproximadamente 2.700 milhas. 
 * Por conta da predominância dos ventos, ao voar de leste a oeste, o voo normalmente dura uma 
 * hora a mais que quando é de oeste a leste. Se o avião de San Diego para Nova York percorrer 
 * uma velocidade de 540 milhas por hora, qual será velocidade do avião que viaja de Nova York 
 * a San Diego sob as mesmas condições?
*/
public class aula23 {

	public static void main(String[] args) {
		double distanciaAprox = 2700;
		
		double velocidade = 540;
		
		double distanciaSD_NY = distanciaAprox / velocidade;
		double distanciaNY_SD = distanciaAprox/(distanciaSD_NY+1);
		
		
		
		System.out.println("Velocidade do avião que viaja de Nova York \r\n"
				+ "a San Diego sob as mesmas condições: " 
				+ String.format("%.0f", distanciaNY_SD));

	}

}
