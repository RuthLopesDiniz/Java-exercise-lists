package Lista01;
/*Em um grupo de duas pessoas, apenas um par pode apertar as mãos. No entanto, em um grupo de três pessoas, três diferentes pares de pessoas podem apertar as mãos. 
 * Quantos diferentes pares de pessoas podem apertar as mãos em um grupo de dez pessoas?
*/
public class aula31 {

	public static void main(String[] args) {
		int pessoa1 = 9;
		int pessoa2 = 8;
		int pessoa3 = 7;
		int pessoa4 = 6;
		int pessoa5 = 5;
		int pessoa6 = 4;
		int pessoa7 = 3;
		int pessoa8 = 2;
		int pessoa9 = 1;
		
		int paresDiferentes = (pessoa1+pessoa2+pessoa3+pessoa4
						+pessoa5+pessoa6+pessoa7+pessoa8+pessoa9);
		System.out.println("Quantos diferentes pares de pessoas podem apertar "
							+ "as mãos em um grupo de dez pessoas? " 
							+ paresDiferentes + " pares diferentes.");

	}

}
