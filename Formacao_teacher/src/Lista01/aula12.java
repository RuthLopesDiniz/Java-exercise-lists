package Lista01;
/*Mina realizou uma longa caminhada na praia em cada um dos seus oito dias de férias. Na metade dos dias, ela 
 * caminhou 3 milhas e na outra metade 5 milhas por dia. 
 * Quantas milhas ela caminhou no total?
 */
public class aula12 {

	public static void main(String[] args) {
		
		int diaFerias = 8;
		int metadeDias = diaFerias/2;
		
		int primeiraMetadeCaminhadaEmMilhas = metadeDias * 3;
		int segundaMetadeCaminhadaEmMilhas = metadeDias * 5;
		
		int totaldemilhascaminhadas = primeiraMetadeCaminhadaEmMilhas 
										+ segundaMetadeCaminhadaEmMilhas;
		System.out.println("Quantas milhas ela caminhou no total? " 
										+ totaldemilhascaminhadas);
		
	}

}
