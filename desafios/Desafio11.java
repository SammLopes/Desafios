package desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * Escreva um programa que receba um vetor de inteiros e retorno a moda. 
 * Caso o vetor tenha mais de uma moda retorno todos os valores. Se não tiver moda retorne 0.
 * 
 * */
public class Desafio11 {
	/*
	 * Quando chegar em casa estudar cada parte do codigo
	 * */
	public static int[] moda(int[] vetor) {
		//Encontra qual é o maior valor do vetor
		int maiorValor = vetor[0];
		for(int i = 1; i < vetor.length; i++) {
			if(vetor[i] > maiorValor) {
				maiorValor = vetor[i];
			}
		}
		
		// Um vetor para contar as frequencias dos valores
		int frequencias[] = new int[maiorValor + 1];
		for(int i = 0; i < vetor.length; i++) {
			frequencias[vetor[i]]++;
		}
		
		//Encontra a moda ou as modas
		int maiorFrequencia = 0;
		for(int i = 0; i < frequencias.length; i++) {
			if(frequencias[i] > maiorFrequencia) {
				maiorFrequencia =  frequencias[i];
			}
		}
		//Verifica se há modas no vetor
		if(maiorFrequencia == 0) {
			return new int[] {0}; 
		}
		List<Integer> modas = new ArrayList<Integer>();
		for(int i = 0; i < frequencias.length; i++) {
			if(frequencias[i] == maiorFrequencia) {
				modas.add(i);
			}
		}
		
		//Convertendo uma lista de modas em um Array de modas
		
		int[] modaArray = new int[modas.size()];
		   for (int i = 0; i < modas.size(); i++) {
		       modaArray[i] = modas.get(i);
		   }
		   
		return modaArray;
		
	}
	
	/*
	 * Ordenando o vetor
	 * 
	 * */
	
	public static int[] sort(int[] vet) {
		
		for(int i = 1; i < vet.length;i++) {
			for(int j = 0; j < i; j++ ) {
				if(vet[i] < vet[j]) {
					int temp = vet[j];
					vet[j] = vet[i];
					vet[i] = temp;
				}
			}
		}
		
		return vet;
	}
	
	public static void print(int vetor[]) {
		for(int i : vetor) {
			System.out.println(i+" ");
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor: ");
	    int size = sc.nextInt();
	    int vetor[] = new int[size];
	    for(int i = 0; i < size; i++) {
	    	vetor[i] = (int) (Math.random()*15);
	    }
	    
	    sort(vetor);
	    for(int i : vetor) {
	    	System.out.println(i+" ");
	    }
	    System.out.println("========");
	    int[] modas = moda(vetor);
        System.out.print("Moda(s) do vetor: ");
        for (int i = 0; i < modas.length; i++) {
            System.out.print(modas[i] + " ");
        }
	   
	}
	
}




	


