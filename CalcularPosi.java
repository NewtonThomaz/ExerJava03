package estruturaCondicional;
import java.util.Scanner;

public class CalcularPosi {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;

		System.out.println("Informe o número: ");
		numero = ler.nextInt();

		if(numero > 0) {
			System.out.println("O número é positivo");
		}else if(numero == 0) {
			System.out.println("O seu número é zero");
		}else{
			System.out.println("O seu número é negativo");
		}
		ler.close();
	}

}
