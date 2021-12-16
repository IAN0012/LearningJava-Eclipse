package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Main {

	public static void main(String[] args) {
		
		/*
		Fazer um programa para ler os dados de um produto em estoque (nome, preço e
				quantidade no estoque). Em seguida:
				• Mostrar os dados do produto (nome, preço, quantidade no estoque,
				 valor total no
				estoque)
				• Realizar uma entrada no estoque e mostrar novamente os dados do 
				produto
				• Realizar uma saída no estoque e mostrar novamente os dados do 
				produto
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product prod = new Product(); 
		
		System.out.println("Enter product data: ");
		//  								^---Dados
		System.out.print("Name: ");
		prod.name = sc.nextLine();
		System.out.print("Price: ");
		prod.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		prod.quantity = sc.nextInt();
		
		// TOTAL
		System.out.println("\n"+prod);
		
		// ADDED IN STOCK
		System.out.println("\nEnter the number of products to be added in stock: ");
		prod.addProducts(sc.nextInt());
		System.out.println(prod);
		
		// REMOVE PRODUCTS
		System.out.println("Enter the number of products to be added in stock: ");
		prod.removeProducts(sc.nextInt());
		System.out.println(prod);
		
		sc.close();
		
	}

}
