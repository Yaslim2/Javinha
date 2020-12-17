package util;

public class Conversor {
	public static double IMPOSTO = 0.06;
	
	public static double converting(double dol, double quant) {
		return (dol * quant) + (dol*quant*IMPOSTO);
	}
}
