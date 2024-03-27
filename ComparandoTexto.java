package estruturaCondicional;
import java.util.Scanner;

public class ComparandoTexto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String p1, p2;

		System.out.println("Informe a primeira palavra:");
		p1 = ler.nextLine();
		System.out.println("Informee a segunda palavra:");
		p2 = ler.nextLine();

		if (p1.equals(p2)) {
			System.out.println("As palavras são iguais");
		}else {
			System.out.println("As palavras são diferentes");
		}
		ler.close();
	}
}