package desafios;
/*
 * Escreva um programa que converta um número binário (base 2) em decimal (base 10).
 * Seu programa deve ler o número binário do usuário como uma 
 * sequência de zeros e uns e exibir o número decimal equivalente, processando 
 * cada dígito da representação binária. Por exemplo, 1010011 (base 2) ≡ 83 (base 10).
 * */
import java.util.Scanner;
public class Desafio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero binário: ");
		String binario = sc.next();
		
		int decimal = 0;
		
		int expoente = binario.length() - 1;
		
		/*
		 * Explicação da Logica do Desafio:
		 * 
		 * decimal += Integer.parseInt(String.valueOf(binario.charAt(i))) * Math.pow(2, expoente); 
		 * adiciona ao valor atual de decimal o resultado da multiplicação entre                   
		 * o dígito atual do número binário (convertido para um número 
		 * inteiro usando Integer.parseInt()) e 2 elevado 
		 * ao expoente correspondente. O expoente é calculado 
		 * como o comprimento do número binário - 1 na primeira iteração e é decrementado a 
		 * cada iteração subsequente.
		 * expoente--; decrementa o valor de expoente em 1 para a próxima iteração do loop.
		 * */
		for(int i = 0; i < binario.length(); i++) {
			decimal += Integer.parseInt(String.valueOf(binario.charAt(i))) * (Math.pow(2,expoente));
			expoente--;
		}
		
		System.out.println("O numero binario "+binario+" é em decimal "+decimal);
	}

}
