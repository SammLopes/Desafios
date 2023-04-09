package desafios;
/*
 * Definimos dois vetores A e B de dimensão n em termos de componentes como:
 *    A = (a1, a2, a3, ..., an) e B = (b1, b2, b3, ..., bn)
 * O produto escalar entre esses vetores é descrito como:
 *    A . B = a1 * b1 + a2 * b2 + a3 * b3 + ... + an * bn
 * Desenvolva um programa que, dado dois vetores de dimensão n, retorne o produto escalar entre eles.
 * 
 * */
import java.util.Scanner;
public class Desafio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho unico dos dois vetores :");
		int tamanhoVet = sc.nextInt();
		//Preenchendo dois vetores
		int[] vet1 = new int[tamanhoVet];
		int[] vet2 = new int[tamanhoVet];
		for(int i = 0; i < tamanhoVet; i++) {
			vet1[i] = (int) Math.floor(Math.random() * 20);
			vet2[i] = (int) Math.floor(Math.random() * 20);
		}
		//vetores preenchidos com os valores aleatorios
		System.out.println("VETOR 1");
		for(int i :vet1) {
			System.out.println(i);
		}
		System.out.println("VETOR 2");
		for(int i : vet2) {
			System.out.println(i);
		}
		int produtoEscalar = produtoVetores(vet1, vet2);
		System.out.println("O produto escalar entre A e B é: "+produtoEscalar);
	}

	private static int produtoVetores(int[] vet1, int[] vet2) {
		int[] produtoVet = new int[vet1.length];
		for(int i = 0; i < vet1.length;i++) {
			produtoVet[i] = vet1[i] * vet2[i];
		}
		int produtoEscalar = 0;
		for(int i : produtoVet) {
			produtoEscalar += i;
		}
		return produtoEscalar;
	}

}
