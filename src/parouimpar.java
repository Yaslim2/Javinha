import java.util.Scanner;

public class parouimpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		x = sc.nextInt();
		
		if(x%2==0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		
		sc.close();

	}

}
