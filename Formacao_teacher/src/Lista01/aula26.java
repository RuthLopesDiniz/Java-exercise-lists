package Lista01;
/*Angela e Gustavo trabalham em uma lanchonete fazendo sanduiches. Em alta velocidade, Angela consegue fazer quatro sanduiches 
 * em três minutos e Gustavo três sanduiches em quatro minutos. Trabalhando juntos, quanto tempo eles levarão para 
 * fazer 200 sanduiches?
*/
public class aula26 {

	public static void main(String[] args) {
		int sandAngela = 4 * 4;
		
		int sandGustavo = 3 * 3;
		
		int minutos = 12;
		
		int totalSandwAmbos = sandAngela + sandGustavo;
		int repeticao = 8;
		
		int tempoFazer200sanduiches = minutos*repeticao;
		int total200 = totalSandwAmbos * repeticao;
		
		
		System.out.println("Os dois juntos fazem " + totalSandwAmbos 
				+ " sanduiches em " + minutos+ " minutos. "
				
				+ "Em " + tempoFazer200sanduiches + " minutos eles fazem " 
				+ total200 + " sanduiches.");
		

	}

}
