package Lista01;
/*Um caderno grande custa R$: 1,50 a mais que um pequeno. Karan comprou dois grandes e quatro pequenos, enquanto Almonte 
 * comprou cinco grandes e um pequeno. Quanto Almonte gastou a mais que Karan?
*/
public class aula8 {

	public static void main(String[] args) {
		double karan = 2*1.50;
		double almonte = 5*1.50;
		
		double almonteGastoAmais = almonte - karan;
		
		System.out.println("Gasto a mais R$ " + String.format("%.2f", (almonteGastoAmais)));

	}

}
