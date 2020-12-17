import java.util.Scanner;

public class uri1116 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double x,y;
		double div=0; 
		for(int i = 0; i<N;i++) {
			x = sc.nextDouble();
			y = sc.nextDouble();
			if(y!=0) {
				div = x/y;
				System.out.println(div);
			} else {
				System.out.println("divisão impossível");
			}
		}
		
		sc.close();
	}

}
