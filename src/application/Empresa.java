package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Empresa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> lista = new ArrayList<>();
		Employee emp;
		
		System.out.print("Quantos funcionários serão contratados: ");
		int x = sc.nextInt();
		
		for(int i=1;i<=x;i++) {
			System.out.print("\nEmployee: " + i + ":\n");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			int condition = hasId(lista, id);
			
			while(condition == 1) {
				System.out.print("ID JÁ UTILIZADO. TENTE NOVAMENTE: ");
				id = sc.nextInt();
				condition = hasId(lista,id);
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salário: ");
			Double salary = sc.nextDouble();
			
			emp = new Employee(id, name, salary);
			lista.add(emp);
		}
		
		
		System.out.print("\nEntre com o ID do funcionário que irá receber um aumento: ");
		int id = sc.nextInt();
		int cond = hasId(lista, id);
		if(cond == 5) {
			System.out.println("ID INEXISTENTE");
		} else {
			System.out.print("Entre com a porcentagem: ");
			int porcentagem = sc.nextInt();
			for(Employee b: lista) {
				if(b.getId() == id) {
					b.increaseSalary(porcentagem);
				}
			}
		}
		
		System.out.println("\nLista de Funcionários: ");
		for(Employee b: lista) {
			System.out.println(b);
		}
		sc.close();
	}

	public static int hasId(List<Employee> lista, int id) {
		int x = -1;
		for(Employee u: lista) {
			if(u.getId() == id) {
				x = 1;
			} 
		}
		return x;
	}
	
}
