package exercicio_1;

public class Retangulo {
	private double altura;
	private double largura;
	
	public Retangulo(double altura, double largura) {
		this.setAltura(altura);
		this.setLargura(largura);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double area() {
		return this.getAltura() * this.getLargura();
	}
	
	public double perimetro() {
		return (this.getAltura() + this.getLargura())*2;
	}
	
	public double diagonal() {
		return Math.sqrt((this.getAltura()*this.getAltura()) + (this.getLargura()*this.getLargura()));
	}
	
	//@override	
	public String toString() {
		return "altura: "
	    + this.getAltura()
		+ " largura: "
		+ this.getLargura()
		+ " diagonal: "
		+ this.diagonal()
		+ " area: "
		+ this.area()
		+ " perimetro: "
		+ this.perimetro();
	}
}
