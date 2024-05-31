package dispositivo.apps.apptelefone;

import java.util.Random;
import java.util.Scanner;

import funcionalidades.aparelhotelefonico.AparelhoTelefonico;

public class AppTelefone implements AparelhoTelefonico {
	public void verOpcoes() {
		boolean vendoOpcoes = true;
		Scanner telefoneScanner = new Scanner(System.in);
		String opcao;
		String numero;
		while (vendoOpcoes) {
			System.out.printf("\n1 - Ligar\n2 - Receber Chamada\n3 - Iniciar Correio de Voz\n4 - Sair\nDigite a Opção: ");
			opcao = telefoneScanner.next();
			switch (opcao) {
			case "1":
				System.out.printf("Digite o número: ");
				numero = telefoneScanner.next();
				ligar(numero);
				break;
			case "2":
				receberChamada();
				break;
			case "3":
				iniciarCorreioDeVoz();
				break;
			case "4":
				vendoOpcoes = false;
				break;
			default:
				System.out.printf("Opção inexistente");

			}
		}
	}

	private boolean chamadaAtendida() {
		Random random = new Random();
		return random.nextBoolean();
	}

	public void ligar(String numero) {
		System.out.printf("\nLigando para o número " + numero+"\n");
		if (chamadaAtendida())
			System.out.printf("\nChamada atendida.\n");
		else
			System.out.printf("\nChamada não atendida.\n");
	}

	public void receberChamada() {
		System.out.printf("\nRecebendo Chamada...\n");
	}

	public void iniciarCorreioDeVoz() {
		System.out.printf("\nInicializando Correio de Voz...\n");
	}
}
