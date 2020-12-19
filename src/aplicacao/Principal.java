package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Department;
import entidades.HourContract;
import entidades.Worker;
import entidades.enums.WorkerLevel;

public class Principal {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		HourContract contract;
		
		System.out.print("Entre com o nome do departamento: ");
		String departmentName = sc.nextLine();
		Department department = new Department(departmentName);
		System.out.println("Entre com os dados do funcionário:");
		System.out.print("Nome: ");
		String nameWorker = sc.nextLine();
		System.out.print("Nível: ");
		String levelWorker = sc.nextLine();
		System.out.print("Salário Base: ");
		Double baseSalary = sc.nextDouble();
		Worker worker = new Worker(nameWorker, WorkerLevel.valueOf(levelWorker), baseSalary, department);
		
		System.out.print("Quantos contratos para esse funcionário? ");
		int numContracts = sc.nextInt();
		
		for(int i = 1; i<=numContracts; i++) {
			System.out.println("Entre com o contrato #" + i + ":");
			System.out.print("DATA (DD/MM/YYYY): ");
			String dating = sc.next();
			Date contractDate = sdf.parse(dating);
			System.out.print("Valor por hora: ");
			double valueContract = sc.nextDouble();
			System.out.print("Duração: ");
			int hours = sc.nextInt();
			contract = new HourContract(contractDate, valueContract, hours);
			worker.addContract(contract);
		}
		
		System.out.print("\nEntre com o mês e ano para saber quanto o funcionário recebeu nesse período (MM/YYYY): ");
		String monthYear = sc.next();
		int month = Integer.parseInt(monthYear.substring(0,2));
		int year = Integer.parseInt(monthYear.substring(3));
		System.out.println("Nome: " + worker.getName());
		System.out.println("Departamento: " + worker.getDepartment().getName());
		Double value = worker.income(year, month);
		System.out.printf("Total de %s: %.2f", monthYear, value);
		sc.close();
	}
	
}
