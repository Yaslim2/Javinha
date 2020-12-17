import java.util.Scanner;

public class uri1153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N;
		N = sc.nextInt();
		int fat = 1;
		for(int i=1; i<=N; i++) {
			fat *= i;
		}
	
		System.out.println(fat);
		
		sc.close();
	}

}
