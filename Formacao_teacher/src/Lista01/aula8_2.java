package Lista01;

public class aula8_2 {

	public static void main(String[] args) {
		double cadernoP = 1.0;
		double cadernoG = cadernoP + 1.50;
		
		double karan = 2*cadernoG + 4 * cadernoP;
		double almonte = 5*cadernoG + cadernoP;
		
		double almonteGastoAmais = almonte - karan;
		
		System.out.println("Quanto Karan gastou a mais? R$ " 
					+ String.format("%.2f", (almonteGastoAmais)));
	}

}
