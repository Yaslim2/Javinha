import java.util.Scanner;

public class whilee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,soma=0;
		while((x = sc.nextInt()) != 0) {
			soma += x;
		}
		
		System.out.println(soma);
		
		
		sc.close();
	}

}
