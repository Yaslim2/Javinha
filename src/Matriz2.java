import java.util.Scanner;

public class Matriz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int matriz[][] = new int[M][N];
		
		for(int i =0;i<M;i++) {
			for(int j = 0; j<N;j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		int X = sc.nextInt();
		int aux1 = 0;
		int aux2 = 0;
		int cond = existe(matriz, X);
		if(cond == 0) {
			System.out.println("Elemento inexistente.");
		} else {
			for(int i =0;i<M;i++) {
				aux1 += 1;
				aux2 = 0;
				for(int j = 0; j<N;j++) {
					aux2 += 1;
					if(matriz[i][j] == X) {
						System.out.println("Position: " + aux1 + "." + aux2);
						if(j>0) {
							System.out.println("Left: " + matriz[i][j-1]);
						}
						if(i>0) {
							System.out.println("Up: " + matriz[i+1][j]);
						}
						if(j<N-1) {
							System.out.println("Right: "+ matriz[i][j+1]);
						}
						if(i<M-1) {
							System.out.println("Down: " + matriz[i+1][j]);
						}
					}
				}
			}
		}
		sc.close();
	}
	
	public static int existe(int matriz[][], int X) {
		int x = 0;
		for(int i =0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length; j++) {
				if(X == matriz[i][j]) {
					x = 1;
				}
			}
		}
		return x;
	}
}
