import java.util.Scanner;

public class functions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a,b,c);
		
		shower(maior);
		
		sc.close();
	}

	public static int max(int x, int y, int z) {
		int aux=0;
		if(x>y && x>z) {
			aux = x;
		} else if(y>z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}
	
	public static void shower(int M) {
		System.out.println(M);
	}
}
