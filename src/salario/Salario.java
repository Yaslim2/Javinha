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
		return "Fala Zez�, bom dia cara! Deixa eu te falar uma coisa. Eu, pensando aqui, sei que est� dif�cil para voc�s a�, \npara arrumar recursos, sei que est� correndo atr�s. \nMas estou falando por mim, n�o falei com ningu�m do time. V� se voc� n�o consegue, pelo menos, pagar esses outros 60% antes do jogo de \nquinta-feira. Que a�, n�o precisa nem ter bicho para ganhar o jogo. \n� uma motiva��o a mais para gente, cara. Voc� j� acertar o sal�rio a� e a� voc� j� n�o precisar arrumar uma premia��o para ganhar o jogo,\nque a obriga��o nossa � ganhar esse jogo t� louco! Se a gente n�o ganhar do CSA pela amor de Deus. \nOh faz esse esfor�o pra a gente a� at� quinta-feira tenta acertar esse 60% do sal�rio que t� atrasado";
	}
}
