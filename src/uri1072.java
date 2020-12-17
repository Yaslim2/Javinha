import java.util.Scanner;

public class uri1072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int x;
		int in=0, out=0;
		
		for(int i = 0;i<N;i++) {
			x = sc.nextInt();
			if(x>=10 && x<=20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		
		System.out.printf("%d in\n", in);
		System.out.printf("%d out\n", out);
		
		sc.close();
	}

}
