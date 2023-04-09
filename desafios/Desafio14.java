package desafios;
/*
 * A maioria dos anos tem 365 dias. No entanto, o tempo necessário para a Terra orbitar o Sol é na 
 * verdade um pouco maior que isso. Para corrigir essa diferença, um dia extra, 29 de fevereiro, está incluído em alguns anos, ditos bissextos. 
 * As regras para determinar se um ano é ou não um ano bissexto são as seguintes:
 * 1 - qualquer ano que seja divisível por 400 é um ano bissexto;
 * 2 - dos anos restantes, qualquer ano que seja divisível por 100 não é um ano bissexto;
 * 3 - dos anos restantes, qualquer ano que seja divisível por 4 é um ano bissexto;
 * todos os outros anos não são anos bissextos. Escreva um programa que leia um ano do usuário e exiba uma mensagem dizendo se ele é ou não um ano bissexto.
 * */
import java.util.Scanner;
public class Desafio14 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Digite um ano :");
		int ano = sc.nextInt();
		String anoBi = calculaAnoBissexto(ano);
		System.out.println(anoBi);
		sc.close();
	}

	private static String calculaAnoBissexto(int ano) {
		if(ano % 400 == 0) {
			return ano+" é ano bissexto";
		}else if (ano % 100 == 0) {
			return ano+" não é bissexto";
		} else if(ano % 4 == 0){
			return ano+" é ano bissexto";
		}else{
			return ano+" não é bissexto";
		}
		
	}

}
