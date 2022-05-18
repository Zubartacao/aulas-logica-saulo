package aula8;

import java.util.Scanner;

public class DiasSemana {

	public static void main(String[] args) {

		int contador = 0;
		String frase = "";
		Scanner scan = new Scanner(System.in);

		System.out.println("digite um numero: ");
		System.out.println("[1] domingo");
		System.out.println("[2] segunda");
		System.out.println("[3] terça");
		System.out.println("[4] quarta");
		System.out.println("[5] quinta");
		System.out.println("[6] sexta");
		System.out.println("[7] sabado");
		contador = scan.nextInt();

		switch (contador) {
		case 1:
			frase = frase + "domingo";
			break;
		case 2:
			frase = frase + "segunda";
			break;
		case 3:
			frase = frase + "terça";
			break;
		case 4:
			frase = frase + "quarta";
			break;
		case 5:
			frase = frase + "quinta";
			break;
		case 6:
			frase = frase + "sexta";
			break;
		case 7:
			frase = frase + "sabado";
			break;
			
		default:
			frase = "você não digitou um numero de semana valido";
			break;
		}
           System.out.println(frase);
	}

}
