package applicattion;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Main {

	public static void main(String[] args) {
		/* 
		 Fazer um programa para ler os dados de um funcionário (nome, salário 
		bruto e imposto). Em seguida, mostrar os dados do funcionário (nome e 
		salário líquido). Em seguida, aumentar o salário do funcionário com base
		em uma porcentagem dada (somente o salário bruto é
		afetado pela porcentagem) e mostrar novamente os dados do funcionário.
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee worker = new Employee();
		
		System.out.print("Name: ");
		worker.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		worker.grossSalary =  sc.nextDouble();
		
		System.out.print("Tax: ");
		worker.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s%n", worker);
		
		System.out.print("Which percentage to increase salary? ");
		double percent = sc.nextDouble();
		worker.increaseSalary(percent);
		
		System.out.printf("Update: %s", worker );
		
		sc.close();
	}

}
