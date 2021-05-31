package exercicio_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do funcionario");
		String nome = sc.nextLine();
		System.out.println("Digite o salário bruto do funcionario");
		double salario = sc.nextDouble();
		System.out.println("Digite a taxa do funcionario");
		double taxa = sc.nextDouble();
		
		
		Funcionario f1 = new Funcionario(nome, salario, taxa);
		System.out.println(f1);
		
		System.out.println("Digite o percentual de aumento");
		double percent = sc.nextDouble();
		f1.aumentarSalario(percent);
        
		sc.close();
        
        System.out.println(f1);
	}

}
