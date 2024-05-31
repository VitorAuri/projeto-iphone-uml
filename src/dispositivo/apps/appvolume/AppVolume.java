package dispositivo.apps.appvolume;

import java.util.Scanner;

import funcionalidades.volumedispositivo.VolumeDispositivo;

public class AppVolume implements VolumeDispositivo {
	public int setVolume(int volumeAtual) {
		Scanner opcaoVolume = new Scanner(System.in);
		String opcao;

		boolean vendoVolume = true;

		while (vendoVolume) {
			System.out.printf("\n1 - Aumentar Volume\n2 - Reduzir Volume\n3 - Sair\nVOLUME ATUAL: " + volumeAtual
					+ "\nOpção Escolhida: ");
			opcao = opcaoVolume.next();
			switch(opcao) {
				case "1":
					if (volumeAtual == 100) {
						System.out.printf("\nVolume máximo atingido\n");
					}
					else {
						volumeAtual += 10;
					}
					break;
				case "2":
					if (volumeAtual == 0) {
						System.out.printf("\nVolume minimo atingido\n");
					}
					else {
						volumeAtual -= 10;
					}
					break;
				case "3":
					System.out.printf("\nSaindo de VOLUME\n");
					vendoVolume = false;
					break;
				default:
					System.out.printf("\nOpção inexistente\n");
					break;
			}
		}
		return volumeAtual;
	}
}
