package Lista01;

public class aula6 {

	public static void main(String[] args) {
		int galoes = 40;
		int pintas = 8;
		int totalPintasPorGalao = 	galoes * pintas;
		
		int libraPorPinta = 1;
		
		int totalLibras = totalPintasPorGalao * libraPorPinta;
		
		System.out.println("40 galões de água pesam " 
							+ totalLibras + " libras.");

	}

}
