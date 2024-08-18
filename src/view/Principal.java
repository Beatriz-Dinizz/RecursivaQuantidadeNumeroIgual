package view;

import controller.QuantidadeNumeroIgual;

public class Principal {

	public static void main(String[] args) {
		int n = 974991;
		int digito = 9;
		
		if(n < 10 || n > 999999) {
			System.out.println("Número inválido! Digite um número entre 10 e 999999.");
			return;
		}
		
		if(digito < 0 || digito > 9) {
			System.out.println("Número inválido! Digite um número entre 0 e 9.");
			return;
		}
		
		int cta = QuantidadeNumeroIgual.quantidadeNumeroIgual(n, digito);
		System.out.println("O número " + digito + " aparece " + cta + " vezes no número " + n);
	}
}
