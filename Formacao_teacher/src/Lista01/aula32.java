package Lista01;
/*Marion descobriu que três tijolos vermelhos e um branco pesam 23 libras. Então, ela trocou um tijolo vermelho por dois brancos e percebeu que o peso aumentou para 
 * 27 libras. Supondo que todos os tijolos vermelhos tenham o mesmo peso e que isto seja válido para todos os brancos também, qual será o peso de um tijolo vermelho?
*/
public class aula32 {

	public static void main(String[] args) {
		int pesoInicial = 23;
        // Definindo o peso total após a troca de um tijolo vermelho 
		//por dois brancos
        int pesoFinal = 27;
        int tijolosVermelhosInicio = 3;
        int pesoTijoloBranco = pesoFinal-pesoInicial;

        // Calculando o peso de um tijolo vermelho
        int pesoTijoloVermelho = 
        		(pesoFinal - pesoTijoloBranco) / tijolosVermelhosInicio;

        // Exibindo o resultado
        System.out.println("O peso de um tijolo vermelho é: " 
        					+ pesoTijoloVermelho + " libras.");
    }
}

	
