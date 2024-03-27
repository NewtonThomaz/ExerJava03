package estruturaCondicional;
import java.util.Scanner;

public class CalculadoraNota {

	public static void main(String[] args) {
		double pn, sn, tn, qn, mn;
		Scanner ler = new Scanner (System.in);

		System.out.println("Digite a primeira nota");
		pn = ler.nextDouble();
		System.out.println("Digite a segunda nota");
		sn = ler.nextDouble();
		System.out.println("Digite a terceira nota");
		tn = ler.nextDouble();
		System.out.println("Digite a quarta nota");
		qn = ler.nextDouble();

		mn = (pn+sn+tn+qn)/4;

		if (mn >= 6) {
			System.out.println("Você foi aprovado, sua média é " + mn);
		}else {
			System.out.println("Você não foi aprovado, sua média é " + mn);
		}
		ler.close();
	}

}
