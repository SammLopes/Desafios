package desafios;

import java.util.Scanner;

/*
 * Escreva um programa que receba um vetor de inteiros e retorno a moda. 
 * Onde houver empate retorno o maior. Se não tiver retorne 0.
 */
public class Desafio10 {
	
	/*Definição de moda:
	 * 
	 * É utilizado um loop for para percorrer cada elemento do vetor. Para cada elemento i, 
	 * o programa calcula a frequência com que ele aparece no vetor, contando quantos elementos iguais a ele existem a partir da posição i. Se a frequência é maior do que a maior frequência encontrada até agora, ou se há empate na frequência e o elemento 
	 * atual é maior do que a moda atual, o programa atualiza a moda e a maior frequência.
	 * */
	
	public static void moda(int vet[], int size) {
		int moda = 0;
		int maxFrequencia = 0;
		for(int i = 0; i < size; i++) {
			int frequencia = 1;
			for(int j = i + 1; j < size; j++ ) {
				if(vet[j] == vet[i]) {
					frequencia++;
				}else {
					break;
				}
				
			}
			if((frequencia > maxFrequencia) || (frequencia == maxFrequencia && vet[i] > moda)) {
				moda = vet[i];
				maxFrequencia = frequencia;
			}
		}
		//Saida do fluxo
		if( maxFrequencia > 1) {
			System.out.println("A moda do vetor é: " + moda);
		}else {
			 System.out.println("Não há moda no vetor. Retornando 0.");
		}
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor: ");
		int size = sc.nextInt();
		int[] nums = new int[size];
		for(int i = 0; i < size; i++) {
			nums[i] = (int) (Math.random()* 15);	
		}
		
		//Antes ser ordenado
		
		for(int i : nums) {
			System.out.println(" "+i);
		}
		System.out.println("Vetor ordenado");
		//Depois da ordenação
		sort(nums);
		for(int i : nums) {
			System.out.println(" "+i);
		} 
		//Calculando a moda
		
		 moda(nums, size);
		
	}

}
