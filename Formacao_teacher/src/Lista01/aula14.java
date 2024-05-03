package Lista01;
/*Se seis camisetas são vendidas a R$ 42, qual é o custo de nove camisetas com o mesmo preço?
*/
public class aula14 {

	public static void main(String[] args) {
		int valorTotal = 42;
		int camisas = 6;
		
		int valorUnidade = valorTotal/camisas;
		
		int custoDe9Camisetas = valorUnidade *9;
		System.out.println("Qual é o custo de nove camisetas "
				+ "com o mesmo preço? " + custoDe9Camisetas);
	}

}
