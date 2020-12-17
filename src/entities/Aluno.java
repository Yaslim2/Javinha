package entities;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double mediaFinal() {
		return nota1+nota2+nota3;
	}
	
	public void mostrarDados() {
		System.out.printf("\nALUNO: %s\nNOTA 1: %.2f\nNOTA 2: %.2f\nNOTA 3: %.2f\n\n", nome, nota1,nota2,nota3);
	}
	
	public double pontosParaPassar() {
		double condicao = 100 * 0.6;
		if(mediaFinal() < condicao) {
			return 60.0 - mediaFinal();
		} else {
			return 0.0;
		}
	}
}
