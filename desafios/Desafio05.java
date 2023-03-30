package desafios;
/*
 * Dado um vetor qualquer sem valores repetidos, descubra qual é o índice do 
 * maior valor e o índice do menor valor. Exemplo no vetor {6, 10, 4 , 21, 9} = {3 e 2}.
 * */
import java.util.Scanner;
public class Desafio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma serie de valores");
		int[] vet = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Index: "+i);
			vet[i] = sc.nextInt();
		}
		System.out.println("=============");
		int maior = -1;
		int menor;
		for(int i : vet) {
			if(i >= maior) {
				maior = i;
		 }
		}
		menor = vet[0];
		for(int i : vet) {
			if(i <= menor) {
				menor = i;
			}
		}
		System.out.println("O maior numero: "+maior);
		System.out.println("O menor numero: "+menor);
	}

}
