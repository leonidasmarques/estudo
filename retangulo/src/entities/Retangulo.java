package entities; 

public class Retangulo {
	
	public double largura;
	public double altura;
	
	
	public double areaRetangulo() {
		return largura * altura;
	}
	
	public double perimetro() {
		return 2 * (altura + largura);
	}
	
	public double diagonal() {
		return Math.sqrt( altura * altura + largura * largura);
	}
	
	

}
