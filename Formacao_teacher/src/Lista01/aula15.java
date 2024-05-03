package Lista01;
/*Kenny fez 25 flexões. Seu irmão mais velho, Sal, fez o dobro da quantidade de flexões de Kenny. E a irmã mais velha deles. 
 * Natalie, fez 10 a mais que Sal. Quantas flexões os três fizeram ao todo?
*/
public class aula15 {
	
	public static void main(String[] args) {
		int flexoesKenny = 25;
		int flexoesSal = flexoesKenny * 2;
		int flexoesNatalie = flexoesSal + 10;
		
		int totalFlexoes  = flexoesKenny + flexoesSal + flexoesNatalie;
		System.out.println("Quantas flexões os três fizeram ao todo? " 
							+ totalFlexoes);
	}

}
