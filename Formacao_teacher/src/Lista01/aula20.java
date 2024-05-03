package Lista01;
/*Um grupo de 70 alunos do terceiro ano possui exatamente a proporção de três meninas para cada quatro meninos. 
 * Quando a professora pede para os alunos se dividirem em pares para um exercício, seis casais compostos por um menino 
 * e uma menina são formados e o restante das crianças será dividido em pares com crianças do mesmo sexo. 
 * Quantos pares de meninos a mais existem em relação aos pares de meninas */

public class aula20 {

	public static void main(String[] args) {
		
		int meninos = 40;
		int meninas = 30;
		
		int casais = 6 ;
		int duplaMeninas = meninas-casais;
		int duplaMeninos = meninos-casais;
		
		int paresAmaisMeninos = (duplaMeninos /2) - (duplaMeninas/2);
		
		System.out.println("Existem " + paresAmaisMeninos + " pares de meninos a mais em relação aos pares de meninas.");
		
		
	}

}
