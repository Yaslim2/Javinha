import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listas {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList<>();
		
		list.add("Ismael");
		list.add("Hanna");
		list.add("Gabriel");
		list.add("Hariel");
		
		list.add(2, "Jamanta");
		
		for(String x: list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("Tamanho da lista: " + list.size());
		System.out.println("-----------------------------------------");
		
		list.removeIf(x -> x.charAt(0) == 'D');
		
		for(String z: list) {
			System.out.println(z);
		}
		
		System.out.println("-----------------------------------------");
		System.out.println("Index de Gabriel: " + list.indexOf("Gabriel"));
		System.out.println("-----------------------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'H').collect(Collectors.toList());
		
		for(String y: result) {
			System.out.println(y);
		}
		System.out.println("-----------------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'H').findFirst().orElse(null);
		
		System.out.println(name);
	}

}
