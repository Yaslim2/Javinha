package entities;

public class Produto {
	private String nome;
	private double preco;
	private int quant;
	
	public Produto() {
	}
	
	public Produto(String nome, double preco, int quant) {
		this.nome = nome;
		this.preco = preco;
		this.quant = quant;
	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuant() {
		return quant;
	}

	public double valorEstoque() {
		return preco * quant;
	}
	
	public void addProdutos(int quant) {
		this.quant += quant;
	}
	
	public void excluirProdutos(int quant) {
		this.quant -= quant;
	}
	
	public void mostrarProdutos() {
		System.out.printf("\nProduct data: %s, R$ %.2f, %d unidades, Total: %.2f\n\n", nome, preco, quant, valorEstoque());
	}
	
	public void mostrarProdutosAtt() {
		System.out.printf("\nUpdated data: %s, R$ %.2f, %d unidades, Total: %.2f\n\n", nome, preco, quant, valorEstoque());
	}
	
	public String toString() {
		return nome 
				+ ", R$: " 
				+ String.format("%.2f", preco) 
				+ ", " 
				+ quant 
				+ " unidades, Total R$: " 
				+ String.format("%.2f", valorEstoque());
	}
}
