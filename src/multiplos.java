import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B,x;
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(B>A) {
			x = B;
			B = A;
			A = x;
		}
		
		if(A%B == 0) {
			System.out.println("MULTIPLOS");
		} else {
			System.out.println("N�O S�O MULTIPLOS");
		}
		
		sc.close();

	}

}
