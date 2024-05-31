package dispositivo.apps.appmusical;

import java.util.Scanner;

import funcionalidades.reprodutormusical.ReprodutorMusical;

public class AppMusical implements ReprodutorMusical {
	boolean musicaPausada = true;
	public void App() {
		String opcao;
		String nomeMusica;
		boolean vendoMusica = true;
		Scanner musicalScan = new Scanner(System.in);
		Scanner nomeScan = new Scanner(System.in);
		
		while(vendoMusica) {
			handleCondicoesOutput();
			opcao = musicalScan.next();
			switch(opcao) {
				case "1":
					System.out.printf("Digite o nome da Musica: ");
					nomeMusica = nomeScan.nextLine();
					escolherMusica(nomeMusica);
					break;
				case "2":
					if(musicaPausada) {
						musicaPausada = false;
						despausarMusica();
					}
					else {
						musicaPausada = true;
						pausarMusica();
					}
					break;
				case "3":
					vendoMusica = false;
					break;
				default:
					System.out.printf("\nOpção inexistente\n");
					break;
			}
		}
	}
	private void handleCondicoesOutput() {
		if(musicaPausada) {
			System.out.printf("\n1 - Escolher Musica\n2 - Despausar Musica\n3 - Sair\nOpção Escolhida: ");
		}
		else {
			System.out.printf("\n1 - Escolher Musica\n2 - Pausar Musica\n3 - Sair\nOpção Escolhida: ");
		}
	}
	public void escolherMusica(String musica) {
		System.out.printf("\nTocando agora: "+musica+"\n");
		
	}
	public void pausarMusica() {
		System.out.printf("\nPausando Musica\n");
		
	}
	public void despausarMusica() {
		System.out.printf("\nDespausando Musica\n");
	}
}