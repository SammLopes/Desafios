package desafios;

import java.util.Arrays;
/*
 * Crie em Java um programa que recebe um numero e 
 * retorne a quantidade de linhas no triangulo de pascal 
 * */
import java.util.Scanner;
public class Desafio16 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Digite um numero inteiro :");
		int linhas = sc.nextInt();
		
		int[][] trianguloPascal = new int[linhas][linhas];
		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j <= i; j++ ) {
				if(j == 0 || j == i) {
					trianguloPascal[i][j] = 1;
				}else {
					trianguloPascal[i][j] = trianguloPascal[i - 1][j - 1] + trianguloPascal[i - 1][j];
				}
			}
		} 
		
		System.out.println("O triangulo de Pascal com "+linhas+" linhas é: ");
		
		/*
		 *Para mostrar na tela do terminal temos duas opções:
		 *
		 **/ 
		
		/*
		 * 1 - Esse trecho de codigo mostra o triangulo de pascal seprando as colunas de forma vertical
		 * 
		 * for(int i = 0; i < linhas; i++) {
		 *   for(int j = 0; j <= i; j++) {
		 *        System.out.println(trianguloPascal[i][j]+" ");
		 *   }
		 *   System.out.println();
		 *}
		 *Saída:
		 *   1 
		 *   
		 *   1 
		 *   1 
		 *   
		 *   1 
		 *   2 
		 *   1
		 *   
		 *   ...
		 *   
		 *   Ou seja, cada linha é transformada em coluna.
		 */
		 
		 
		
		/*
		 * 2 - Esse codigo ele mostra o triangulo de pascal na forma de um triangulo retangulo.
		 * 
		 * */
		int espacos = 4;//Define um espaço entre as colunas
		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.printf("%-"+Math.abs(espacos)+"d",trianguloPascal[i][j]);
				// Aqui é estabelecido o espaço entre as colunas e colocado o valor dentro da linha e coluna
				// formando a linha.
			}
			System.out.println();// Nesta parte o println pula para proxima linha
		}
		
	}

}
