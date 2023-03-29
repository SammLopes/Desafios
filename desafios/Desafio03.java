package desafios;
/*
 * Faça um programa que some todos os valores 
 * entre um intervalor (inicio, fim).
 * */
import java.util.Scanner;
public class Desafio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois numeros");
		System.out.println("Numero 1:");
		int inicio = sc.nextInt();
		System.out.println("Numero 2:");
		int fim = sc.nextInt();
		
		while(!(inicio < fim)) {
			System.out.println("Numero 1 não pode ser maior que o Numero 2");
		    System.out.println("Numero 1:");
		    inicio = sc.nextInt();
		    System.out.println("Numero 2:");
		    fim = sc.nextInt();
		}
		
		int soma = 0;
		for(int i = inicio; i <= fim; i++) {
			soma += i;
			System.out.println(i);
		}
		System.out.println("A soma dos numeros no intervalo de "+inicio+" e "+fim+" é "+soma);
	}

}
