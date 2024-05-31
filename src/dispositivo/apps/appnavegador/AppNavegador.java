package dispositivo.apps.appnavegador;

import java.util.Scanner;

import funcionalidades.navegadorinternet.NavegadorInternet;

public class AppNavegador implements NavegadorInternet {
	boolean conexaoInternet;
	boolean vendoNavegador = true;

	public AppNavegador(boolean conexaoInternet) {
		this.conexaoInternet = conexaoInternet;
	}

	public void abrirNavegador() {
		Scanner navegadorScanner = new Scanner(System.in);
		String opcao;
		String paginaNome;
		while (vendoNavegador) {
			System.out.printf("\n1 - Escolher Pagina\n2 - Atualizar Pagina\n3 - Sair\nOpção Selecionada: ");
			opcao = navegadorScanner.next();
			switch (opcao) {
			case "1":
				if (conexaoInternet) {
					System.out.printf("Insira o nome da página: ");
					paginaNome = navegadorScanner.next();
					escolherPagina("www." + paginaNome + ".com");
				} else {
					System.out.printf("\nNão é possivel achar página!\nVocê se encontra sem internet.\n");
				}
				break;
			case "2":
				if (conexaoInternet) {
					atualizarPagina();
				} else {
					System.out.printf("\nNão é possivel atualizar página!\nVocê se encontra sem internet.\n");
				}
				break;
			case "3":
				vendoNavegador = false;
				break;
			default:
				System.out.printf("\nOpção inexistente.\n");
			}
		}
	}

	public void escolherPagina(String url) {
		System.out.printf("Você agora está na página: " + url);
	}

	public void atualizarPagina() {
		System.out.printf("\nAtualizando página...\n");
	}

}
