package desafios;
/*
 * Escreva um programa que 
 * organize um vetor de inteiros em ordem crescente.
 * */
import java.util.Scanner;
public class Desafio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma sequecia de numeros");
		
		int[] vet = new int[5];
		
		for(int i = 0; i < 5; i++) {
			vet[i] = sc.nextInt();
		}
		
		for(int i = 1; i < vet.length;i++) {
			for(int j = 0; j  < i;j++) {
				if(vet[i] < vet[j]) {
				   int temp = vet[j];
				   vet[j] = vet[i];
				   vet[i] = temp;
				}
			}
		}	
			
			
		for(int i : vet) {
			System.out.println(i+" , ");
		}
		
		
	}


	}

