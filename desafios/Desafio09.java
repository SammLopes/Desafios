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
		
		for(int i = 0; i < binario.length(); i++) {
			decimal += Integer.parseInt(String.valueOf(binario.charAt(i))) * (Math.pow(2,expoente));
			expoente--;
		}
		
		System.out.println("O numero binario "+binario+" é em decimal "+decimal);
	}

}
