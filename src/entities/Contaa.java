package entities;

public class Contaa {
	
	private String nome;
	private int numConta;
	private double saldo;
	
	public Contaa(String nome, int numConta) {
		this.nome = nome;
		this.numConta = numConta;
	}
	public Contaa(String nome, int numConta, double saldoInicial) {
		this.nome = nome;
		this.numConta = numConta;
		depositar(saldoInicial);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double value) {
		saldo += value;
		System.out.println("Depositado R$: " + value);
		System.out.println("Total: R$: " + saldo);
	}
	
	public void sacar(double value) {
		if(saldo - value < 0) {
			System.out.println("Impossível realizar operação.");
		} else {
			saldo -= value;
			System.out.println("Retirado R$: " + value);
			System.out.println("Total: R$: " + saldo);
		}
	}
	public String toString() {
		return "NUMERO: " + numConta + " -- TITULAR: " + nome + " -- R$: " + saldo;
	}
}
