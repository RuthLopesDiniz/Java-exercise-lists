package Lista01;
/*Louise trabalha no varejo e possui uma meta de vendas de R$: 1.200 por dia. Na segunda-feira, ela excedeu a meta em R$: 450. 
 * Na terça-feira, ela excedeu a meta em R$: 650. Na quarta e na quinta, ela atingiu exatamente a meta. 
 * Como a sexta-feira foi um dia nebuloso, Louise vendeu R$: 250 a menos que sua meta. 
 * Qual foi seu total de vendas ao longo dos cinco dias?
*/
public class aula29 {

	public static void main(String[] args) {
		double metaDiaria = 1200;
		double segunda = metaDiaria + 450;
		double terca = metaDiaria + 650;
		double quarta = metaDiaria + 0;
		double quinta = metaDiaria + 0;
		double sexta = metaDiaria - 250;
		
		double vendas5dias = (segunda + terca + quarta + quinta + sexta);
		
		System.out.println("Total de vendas ao longo de 5 dias: R$ " 
							+ String.format("%.2f", (vendas5dias)) );

	}

}
