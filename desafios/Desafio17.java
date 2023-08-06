/*
 * 
 * 	Números palindrômicos. Um palíndromo é uma palavra ou expressão que pode ser lida da esquerda para a direita ou da direita para a esquerda 
 *	mantendo o mesmo significado. Um exemplo de palíndromo é a palavra “reviver”.
 *
 *	Neste desafio, a idéia é imprimir todos os números palindrômicos entre dois outros números. Tal como as palavras, os números palindrômicos mantém o mesmo valor se lidos de trás para a frente.
 *
 * 	Exemplo 1: Dado o número inicial 1 e número final 20, o resultado seria: 1, 2, 3, 4, 5, 6, 7, 8, 9, 11.
 *
 *	Exemplo 2: Dado o numero inicial 3000 e número final 3010, o resultado seria: 3003.
 *
 *	Para o desafio, assuma:
 *	Apenas inteiros positivos podem ser usados como limites. Números de um algarismo são palíndromos por definição. Máximo número: (1 << 64) - 1 (máximo unsigned int de 64 bits). Bônus: Se o desafio parece fácil demais, 
 * 	implemente um novo tipo de dados para calcular pra qualquer número com precisão 
 *	arbitrária (limite: 100000 algarismos por número). O uso de bibliotecas matemáticas de precisão arbitrária não será considerado como uma solução válida.
 * */
package desafios;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Desafio17 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Entre com um numero inicial:");
		Long inicial = sc.nextLong();
		System.out.println("Entre com um numeri final");
		Long end = sc2.nextLong();
		
		List<Long> palindromeRange = calcPalindromo(inicial, end);
		System.out.println(palindromeRange);
	}
	
	public static boolean isPalindrome(long valor) {
		String str = Long.toString(valor);
		String reverseStr = new StringBuilder(str).reverse().toString();
		return str.equals(reverseStr);
	}
	
	public static List<Long> calcPalindromo(long valorInicial, long valorFinal) {
		List<Long> palindromes =  new ArrayList<>();
		for(Long start =  valorInicial; start <= valorFinal; start++) {
			if(isPalindrome(start)) {
				palindromes.add(start);
			}
		}
		return palindromes;
	}
}
