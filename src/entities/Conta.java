package entities;

public class Conta {
	private int numConta;
	private String nomeConta;
	private double saldo;
	
	public Conta(int numConta, String nomeConta, double depositoInicial) {
		this.numConta = numConta;
		this.nomeConta = nomeConta;
		deposito(depositoInicial);
	}
	
	public Conta(int numConta, String nomeConta) {
		this.numConta = numConta;
		this.nomeConta = nomeConta;
	}

	public int getNumConta() {
		return numConta;
	}

	public String getNomeConta() {
		return nomeConta;
	}

	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void saque(double saque) {
		saldo -= saque + 5;
	}
	
	public void deposito(double deposito) {
		saldo += deposito;
	}
	
	public String toString() {
		return "Conta: " + numConta + " Titular: " + nomeConta + " Saldo: R$ " + saldo + "\n";
	}
}
