import java.util.Scanner;

public class strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String original = "abce FGHIJ ABC abc DEFG";
		
		
		String s1 = original.toLowerCase();
		String s2 = original.trim();
		String s3 = original.substring(2);
		String s4 = original.substring(2, 9);
		String s5 = original.replace('a', 'x');
		String s6 = original.replace("abc", "x");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		
		String senha = "abc";
		String a = sc.next();
		
		if(a.equals(senha)) {
			System.out.println("Correto.");
		}
		
		String lixo = sc.nextLine();
		String s = sc.nextLine();
		String[] vector = s.split(" ");
		System.out.println(vector[0]);
		System.out.println(vector[1]);
		System.out.println(vector[2]);
		sc.close();
	}

}
