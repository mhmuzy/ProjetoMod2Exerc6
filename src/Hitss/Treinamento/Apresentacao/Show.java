package Hitss.Treinamento.Apresentacao;

import java.util.Scanner;

public class Show {
	public static void main(String[] args) {
		try {
			String mercadoria;
			double preco, quantTotal;
			
			quantTotal = 0;
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("");
			System.out.println("         Hitss Treinamento");
			System.out.println("");
			do {
				System.out.println("Digite a Marcadoria:");
				System.out.println("");
				mercadoria = teclado.next();
				System.out.println("");
				System.out.println("Digite o Preço do Produto:");
				System.out.println("");
				preco = teclado.nextDouble();
				System.out.println("");
				quantTotal += preco;
			} while (mercadoria.equals("exit"));
			
			if (mercadoria == "exit") {
				System.out.println("A quantidade total do Valor da Venda é de: R$ " + quantTotal);
				System.out.println("Fim do Programa.");
			}
			
		} catch (Exception e) {
			System.out.println("Erro de Processamento: " + e.getMessage());
		}
	}
}
