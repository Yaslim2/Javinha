import java.util.Scanner;

public class forr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int y,soma=0;
		
		for(int i = 0; i<N;i++) {
			y = sc.nextInt();
			soma += y;
		}
		
		
		System.out.println(soma);
		sc.close();
	}

}
