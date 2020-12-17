package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o produto:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		
		Produto produto = new Produto(nome, preco);
		produto.mostrarProdutos();
		
		System.out.print("Entre com a quantidade de produtos que você deseja adicionar no estoque: ");
		int x = sc.nextInt();
		produto.addProdutos(x);
		
		produto.mostrarProdutosAtt();
		
		System.out.print("Entre com a quantidade de produtos que você deseja retirar do estoque: ");
		x = sc.nextInt();
		produto.excluirProdutos(x);
		
		produto.mostrarProdutosAtt();
		sc.close();
	}

}
