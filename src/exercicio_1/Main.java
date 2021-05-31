package exercicio_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a altura:");
		double altura = sc.nextDouble();
		System.out.println("Digite a largura:");
		double largura = sc.nextDouble();
		sc.close();
		
		Retangulo r1 = new Retangulo(altura, largura);
		System.out.println(r1);
	}

}
