package desafios;
/*
 * Escreva um programa que receba um vetor de inteiros e calcule o valor do desvio padrão dos valores.
 * Definição de desvio padrão:
 *  O desvio padrão é uma medida que expressa o grau de dispersão 
 *  de um conjunto de dados. Ou seja, o desvio padrão indica o quanto 
 *  um conjunto de dados é uniforme. Quanto mais próximo de 0 for o desvio 
 *  padrão, mais homogêneo são os dados.
 * */
import java.util.Scanner;
public class Desafio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor:");
		int tamanho = sc.nextInt();
		int vet[] = new int[tamanho];
		
		for(int i =0 ; i < vet.length;i++) {
			vet[i] = (int)(Math.random() * 20) ;
		}
		
		double desvioPadrao = calculoDesvioPadrao(vet);
		for(int i : vet) {
			System.out.println(i+" ");
		}
		System.out.printf(" O Desvio Padrão é:"+desvioPadrao);
		
		sc.close();
	}
	
	public static double calculoDesvioPadrao(int[] vetor ) {
		//calculo da media dos valores
		double media = 0;
		
		for(int valor : vetor) {
			media += valor;
		}
		 media /= vetor.length;
		 
		//Calculo entre os quadrados da diferença entre cada valor e a media 
		 double somaDiferencaQuadrados = 0;
		 for(int valor : vetor) {
			  somaDiferencaQuadrados += Math.pow(valor - media, 2);
		 }
		 
		 //Calculo do desvio padrão
		 double calculoDesvioPadrao = Math.sqrt(somaDiferencaQuadrados / vetor.length);
		
		return calculoDesvioPadrao;
	}

}
