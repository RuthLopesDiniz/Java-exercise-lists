package Lista01;
/*. Kendra vendeu 50 caixas de biscoito em 20 dias. Sua irmã mais velha, Alicia, vendeu o dobro das caixas na metade do tempo. 
 * Se as meninas continuassem com a meta de vendas, quantas caixas elas poderiam ter vendido no total se ambas tivessem 
 * trabalhado por 40 dias?
*/
public class aula19 {

	public static void main(String[] args) {
		double cxsKendria = 50;
		double diasKendria = 20;
		
		double cxsAlicia = 100;
		double diasAlicia = 10;
		
		double vendasPorDiaKendria = cxsKendria / diasKendria;
		double vendasPorDiaAlicia = cxsAlicia / diasAlicia;
		
		double meta40diasKendria = vendasPorDiaKendria * 40;
		double meta40diasAlicia = vendasPorDiaAlicia * 40;
		double total = meta40diasKendria +meta40diasAlicia;
		
		System.out.println("Em 40 dias Kendria venderia " + String.format
				("%.0f", (meta40diasKendria)) + " caixas e Alicia venderia "
				+ String.format("%.0f", (meta40diasAlicia)) + " caixas de biscoito.");
		
		System.out.println("As duas venderiam no total: " + 
				String.format("%.0f", (total)) + " caixas de biscoito.");

	}

}
