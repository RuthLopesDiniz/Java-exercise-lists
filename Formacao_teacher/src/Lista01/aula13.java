package Lista01;

public class aula13 {

	public static void main(String[] args) {
		int totalViagem = 250;
		int primeiroDia = 100;
		int segundoDia = primeiroDia - 20;
		int terceiroDia = totalViagem - primeiroDia - segundoDia;
		
		System.out.println("Quantas milhas os atletas "
				+ "percorreram no terceiro dia?\r\n"
				+ "" + terceiroDia + " milhas.");
	}

}
