package dispositivo;

import java.util.Scanner;

import dispositivo.apps.appmusical.AppMusical;
import dispositivo.apps.appnavegador.AppNavegador;
import dispositivo.apps.apptelefone.AppTelefone;
import dispositivo.apps.appvolume.AppVolume;

public class Iphone {
	public static void main(String args[]) {
		boolean ligado = true;
		int volume = 50;
		boolean conectadoInternet = true;
		String escolherFuncionalidade;

		Scanner scan = new Scanner(System.in);
		
		AppVolume appVolume;
		AppMusical appMusic;
		AppNavegador appNavegador;
		AppTelefone appTelefone;

		System.out.printf("Inicializando Iphone\nBem vindo(a)!");

		while (ligado) {
			System.out.printf(
					"\n1 - Desligar dispositivo\n2 - Volume\n3 - Musica\n4 - Navegador\n5 - Telefone\nOpção Escolhida: ");
			escolherFuncionalidade = scan.next();

			switch (escolherFuncionalidade) {
			case "1":
				System.out.printf("Desligando. . .");
				ligado = false;
				break;
			case "2":
				appVolume= new AppVolume();
				volume = appVolume.setVolume(volume);
				break;
			case "3":
				appMusic = new AppMusical();
				appMusic.App();
				break;
			case "4":
				appNavegador = new AppNavegador(conectadoInternet);
				appNavegador.abrirNavegador();
				break;
			case "5":
				appTelefone = new AppTelefone();
				appTelefone.verOpcoes();
				break;
			default:
				System.out.printf("\nNenhum aplicativo corresponde com o valor inserido.\n");
			}
		}

	}
}
