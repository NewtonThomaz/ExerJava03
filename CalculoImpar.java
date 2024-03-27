package estruturaCondicional;
import java.util.Scanner;

public class CalculoImpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n;

		System.out.println("Digite o seu número:");
		n = ler.nextInt();

		if (n % 2 == 1 ) {
			System.out.println("O seu número é Impar");
		}else {
			System.out.println("O seu número é Par");
		}
		ler.close();
	}
}