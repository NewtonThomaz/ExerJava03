package estruturaCondicional;
import java.util.Scanner;

public class CalculoTriangulo {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		double l1, l2, l3;

		System.out.println("Qual o tamanho do primeiro lado:");
		l1 = ler.nextDouble();
		System.out.println("Qual o tamanho do segundo lado");
		l2 = ler.nextDouble();
		System.out.println("Qual o tamanho do terceiro lado");
		l3 = ler.nextDouble();

		if (l1 == l2 && l2 == l3) {
			System.out.println("Seu triângulo é equilátero");
		}else if (l1 == l2 || l1 == l3 || l2 == l3) {
			System.out.println("Seu triângulo é isósceles");
		}else {
			System.out.println("Seu triângulo é escaleno");
		}
		ler.close();
	}
}