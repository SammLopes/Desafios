package desafios;
/*
 * 7 - Escreva um programa que receba um vetor de inteiros e calcule a média da valores.
 * */
import java.util.Random;
public class Desafio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gerador = new Random();
		
		int[] vet = new int[10];
		
		int soma = 0;
		int cont = 0;
		
		for(int i = 0; i < vet.length; i++) {
			int numRandom = (int)(Math.random() * 20) ;
			vet[i] = numRandom;
			soma += vet[i];
			cont++;
			System.out.println("("+i+"): "+vet[i]);
		}
		
		int media = soma / cont ;
		
		System.out.println("A soma dos numeros é de: "+soma);
		System.out.println("A quantidade de numeros do vetor: "+cont);
		System.out.println("A media dos numero é de: "+media);
		
		
	}

}
