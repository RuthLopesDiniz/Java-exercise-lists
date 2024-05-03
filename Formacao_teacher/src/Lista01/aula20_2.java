package Lista01;

public class aula20_2 {

	public static void main(String[] args) {
		        
		        int totalAlunos = 70;

		        // Proporção de meninas para meninos
		        double proporcaoMeninasParaMeninos = 3.0 / 4.0;

		        //  número de meninas e meninos
		        int numMeninas = (int) (totalAlunos / (1 + proporcaoMeninasParaMeninos));
		        int numMeninos = totalAlunos - numMeninas;

		        int paresMeninas = numMeninas / 2;

		        
		        int paresMeninos = numMeninos / 2;

		        int diferencaPares = paresMeninos - paresMeninas;

		        System.out.println("Existem " + Math.abs(diferencaPares) 
		        			+ " pares de meninos a mais que de meninas.");
		    }
}
