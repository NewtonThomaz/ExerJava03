package estruturaCondicional;
import java.util.Scanner;

public class CaixaRegis {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String cpf,cpf1, senha, senha1;
		double sac, sal, sal1;
		
		senha1 = "senha";
		cpf1 = "123.456.789-10";
		sal1 = 32000;

		System.out.println("Digite seu CPF");
		cpf = ler.nextLine();
		
		if (cpf.equals(cpf1)) {
			System.out.println("Digite sua senha");
			senha = ler.nextLine();
			
			if (senha.equals(senha1)) {
				System.out.println("Seu saldo: R$ " + sal1);
				System.out.println("Quanto deseja sacar:");
				sac = ler.nextDouble();
				
				if (sac <= sal1) {
					sal = sal1 - sac;
					System.out.println("Seu saldo foi atualizado:" + sal + " reais.");
				}else {
					System.out.println("Saldo insuficiente");
				}
			}else {
				System.out.println("Senha incorreta");
			}
		}else {
			System.out.println("CPF invalido");
		}
		ler.close();
	}
}