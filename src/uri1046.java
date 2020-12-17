import java.util.Scanner;

public class uri1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y,resultado,aux;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x>y) {
			aux = 24+y;
			resultado = Math.abs(x-aux);
		} else {
			resultado = Math.abs(x-y);
		}
		
		if(resultado>0) {
			System.out.printf("O JOGO DUROU %d HORA(S)", resultado);
		} else if(resultado == 0) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		sc.close();
		
	}
}
