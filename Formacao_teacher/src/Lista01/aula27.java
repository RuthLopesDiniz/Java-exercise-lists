package Lista01;
/*Todas as 16 crianças da escola primária da Sra. Morrow possuem dois ou três irmãos. De modo geral, as crianças possuem um 
 * total de 41 irmãos. Quantas das crianças possuem três irmãos?
*/

public class aula27 {

	public static void main(String[] args) {
		int criancas = 16;
		int totalIrmaos = 41;
		
		int criancasCom2irmaos = criancas * 2;
		int criancasCom3irmaos = totalIrmaos - criancasCom2irmaos;
		
		System.out.println(criancasCom3irmaos 
						+ " crianças tem 3 irmãos.");

	}

}
