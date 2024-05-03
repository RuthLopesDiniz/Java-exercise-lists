package Lista01;
/*Supondo que você decida economizar um real no primeiro dia do mês, dois reais no segundo, quatro reais no terceiro e que continue a duplicar a quantidade a cada dia. 
 * Quantos dias serão necessários para que você economize um total de mais de R$: 30.000?
*/
public class aula36 {

	public static void main(String[] args) {

		    
		        double totalEconomizado = 0;
		        int dia = 1;
		        int valorEconomizado = 1; // Primeiro valor
		        double valorTotalAlvo = 30000;
		       
		        while (totalEconomizado <= valorTotalAlvo) {
		            totalEconomizado = valorEconomizado++;
		            
		         // Dobrar o valor economizado a cada dia
		            valorEconomizado = 2*valorEconomizado; 
		            dia++;
		        }
		       
		        System.out.println("Para economizar mais de R$ 30.000, "
		        				+ "serão necessários " + (dia - 1) + " dias.");
		    }
		

	}


