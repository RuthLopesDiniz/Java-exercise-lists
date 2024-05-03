package Lista01;

public class aula10 {

	public static void main(String[] args) {
		int totalCaneta = 40;
		
		int pacotecom8 = 8;
		double valorPac8 = 7;
		double compraCom8 = valorPac8/pacotecom8;
		double valorTotal8 = compraCom8*totalCaneta;
		
		int pacotecom10 = 10;
		double valorPac10 = 8;
		double compraCom10 = valorPac10/pacotecom10;
		double valorTotal10 = compraCom10*totalCaneta;
		
		double diferenca = valorTotal8 - valorTotal10;
		
		System.out.println(diferenca);
	}

}
