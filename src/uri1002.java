import java.util.Locale;
import java.util.Scanner;

public class uri1002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double r;
		double area;
		r = sc.nextDouble();
		area = 3.14159 * Math.pow(r, 2);
		
		System.out.printf("%.4f", area);
		
		sc.close();

	}

}
