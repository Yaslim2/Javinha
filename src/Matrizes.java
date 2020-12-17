import java.util.Locale;
import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int matriz[][] = new int[N][N];
		int i,j;
		for(i =0;i<N;i++) {
			for(j=0; j<N; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println("\nMain diagonal: ");
		for(i =0;i<N;i++) {
			for(j =0; j<N; j++) {
				if(i == j) {
					System.out.print(matriz[i][j] + " ");
				}
			}
		}
		System.out.println();
		int negatives=0;
		for(i =0;i<N;i++) {
			for(j =0; j<N; j++) {
				if(matriz[i][j] < 0) {
					negatives += 1;
				}
			}
		}
		
		System.out.println("Negative numbers: " + negatives);
		
		sc.close();
	}

}
