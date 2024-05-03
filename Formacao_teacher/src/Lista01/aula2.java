package Lista01;

/*Com uma altura de 2.717 pés, o prédio mais alto do mundo é o Burj Khalifa, em Dubai. Ele é 1.263 pés mais alto que o Empire 
 State Building, em Nova York. Qual é a altura do Empire State Building?
*/
public class aula2 {
	public static void main(String[] args) {
		double auturaBurjKhalifa = 2717 ;
		double alturaAmais= 1263;
		
		double diferenca = (auturaBurjKhalifa - alturaAmais);
		
		System.out.println("A diferença de altura entre o Empire State "
				+ "Building e o Burj Khalifa é: " + String.format("%.3f", 
				(diferenca)) + " pés");
	}
}
