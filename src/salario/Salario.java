package salario;

public class Salario {
	private double salario;

	public Salario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentoDoSalario(double porcentagem) {
		salario = salario + salario*porcentagem;
	}
	public String toString() {
		return "Fala Zezé, bom dia cara! Deixa eu te falar uma coisa. Eu, pensando aqui, sei que está difícil para vocês aí, \npara arrumar recursos, sei que está correndo atrás. \nMas estou falando por mim, não falei com ninguém do time. Vê se você não consegue, pelo menos, pagar esses outros 60% antes do jogo de \nquinta-feira. Que aí, não precisa nem ter bicho para ganhar o jogo. \nÉ uma motivação a mais para gente, cara. Você já acertar o salário aí e aí você já não precisar arrumar uma premiação para ganhar o jogo,\nque a obrigação nossa é ganhar esse jogo tá louco! Se a gente não ganhar do CSA pela amor de Deus. \nOh faz esse esforço pra a gente aí até quinta-feira tenta acertar esse 60% do salário que tá atrasado";
	}
}
