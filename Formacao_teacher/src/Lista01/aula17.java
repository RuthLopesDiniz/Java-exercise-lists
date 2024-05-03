package Lista01;
/*Simon observou dois números quadrados que somam 130. Ele então, percebeu que, ao subtrair um destes números quadrados por 
 * outro, o resultado é 32. Qual é o menor número desses dois números quadrados?
*/
public class aula17 {

	public static void main(String[] args) {
		int somaDoisQuadrados = 121;
		int dezAoQuadrado = 100;
		int onzeAoQuadrado=  100;
		int noveAoQuadrado = 81;
		int oitoAoQadrado = 64;
		int seteAoQadrado = 49;
		
		int op1 = somaDoisQuadrados - onzeAoQuadrado;
		int op2 = somaDoisQuadrados - dezAoQuadrado;
		int op3 = somaDoisQuadrados - noveAoQuadrado;
		int op4 = somaDoisQuadrados - oitoAoQadrado;
		int op5 = somaDoisQuadrados - seteAoQadrado;
		
		int resultado = op3;
		
		System.out.println("Qual é o menor número desses"
				+ " dois números quadrados? " + resultado);

	}

}
