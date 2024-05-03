package Lista01;
/*Uma empresa investe R$: 7.000.000 no desenvolvimento de um produto. Assim que este produto chegar às lojas cada venda 
 * retornará R$: 35 do investimento. Se o produto for vendido a uma taxa constante de 25.000 por mês, quanto tempo levará 
 * para a empresa recuperar o investimento inicial?
*/
public class aula9 {

	public static void main(String[] args) {
		double retornoVenda = 35;
		double investimento = 7000000 ;
		double taxaConstante = 25000 ;
		
		double quantidadeVendas = investimento /retornoVenda;
		
		double tempoRetorno = quantidadeVendas / taxaConstante;
		
		System.out.println("quanto tempo levará \r\n"
				+ "  para a empresa recuperar o investimento inicial? " 
				+ String.format("%.0f", (tempoRetorno)));

	}

}
