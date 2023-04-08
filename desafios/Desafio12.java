package desafios;
/*
 * O máximo divisor comum (MDC) de dois inteiros positivos, n e m, é o 
 * maior número, d, capaz de dividir n e m sem deixar resto. Existem vários algoritmos 
 * para determinar d, incluindo o seguinte:
 * 
 * 1 - inicialize d como o menor entre m e n;
 * 2 - enquanto d não dividir exatamente m e n, diminua o valor de d de uma unidade. 
 * 
 * Ao final do algoritmo, d será o MDC de n e m. Escreva um programa que leia dois inteiros positivos do usuário e use 
 * esse algoritmo para determinar e relatar seu máximo divisor comum
 * */
import java.util.Scanner;
public class Desafio12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um dois numeros");
		System.out.println("Numero 1: ");
		int num1 = sc.nextInt();
		System.out.println("Numero 2: ");
		int num2 = sc.nextInt();
		int maiorDivisor = mdc(num1, num2);
		System.out.println("O MDC entre "+num1+" e "+num2+" é "+maiorDivisor);
		
	}

	private static int mdc(int num1, int num2) {
		//caso os dois forem zero
		if(num2 == 0) {
			return num1;
		}
		if(num1 == 0) {
			return num2;
		}
		int menor = Math.min(num1, num2);
		int d = menor;
		int mdc = 1;
		int i = 2 ;
		do{
			if(num1 % d == 0 && num2 % d == 0) {
				mdc = d;
			}
			d--;
			i++;
		}while(i <= menor);
		return mdc;
	}
}
