package controller;

public class QuantidadeNumeroIgual {

	public QuantidadeNumeroIgual() {
		super();
	}
	
	public static int quantidadeNumeroIgual(int n, int qtd) {
		// Condição de parada: quando o número for 0, significa que chegou na ultima posição e não tem mais números para verificar.
		if(n == 0) {
			return 0;
		}
		// Atribuindo a variavel ultimaPosicao o último digito do numero.
		int ultimaPosicao = n % 10;
		
		// Se o último digito for igual ao dígito procurado, soma 1 ao resultado e chama a função recursiva
		if(ultimaPosicao == qtd) {
			return 1 + quantidadeNumeroIgual(n / 10, qtd);
			} else {
				return quantidadeNumeroIgual(n / 10, qtd);
		}
	}
}
