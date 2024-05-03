package Lista01;

public class aula28 {

	public static void main(String[] args) {
		// Variável para armazenar a soma
        int soma = 0;

        // Loop de 1 a 100 para somar os números
        for (int i = 1; i <= 100; i++) {
            soma += i; // Adiciona o número atual à soma
        }

        // Exibe o resultado
        System.out.println("A soma de todos os números de 1 a 100 é: " 
        					+ soma);
    }
}
