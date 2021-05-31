package exercicio_2;

public class Funcionario {
	private String nome;
	private double salarioBruto;
	private double taxa;
	
	public Funcionario(String nome, double salario, double taxa) {
		this.nome = nome;
		this.salarioBruto = salario;
		this.taxa = taxa;
	}

	public String getNome() {
		return nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salario) {
		this.salarioBruto = salario;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public void aumentarSalario(double taxa) {
		double novoSalario = this.getSalarioBruto()*((100 + taxa)*0.01);
		this.setSalarioBruto(novoSalario);
	}
	
	public double salarioLiquido() {
		return this.getSalarioBruto() - this.getTaxa();
	}
	
	public String toString() {
		return "Nome: "
				+this.getNome()
				+ " Salário Bruto: "
				+this.getSalarioBruto()
				+" Salário Líquido: "
				+this.salarioLiquido();
	}
}