package com.desafios;
/*
 * Faça um programa para identificar se um número é primo.
 * @Author Samuel Lopes
 * */
import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Entre com um numero:");
		int num = sc.nextInt();
		
		boolean eprimo = true;
		//Esse loop for vai ate a metade do numero, porque nenhum numero primo 
		//pode ser divisivel por um numero que é maior que a sua metade
		for(int i = 2; i < num / 2; i++) {
			//Aqui dividimos o numero digitado pelo variavel de iteração i
			//se for divisivel então atribuimos o valor de eprimo para false
			if(num % i == 0) {
				eprimo = false;
				break;
			}
		}
		
		if(eprimo) {
			System.out.println("Seu numero "+num+" é primo");
		}else {
			System.out.println("Seu numero "+num+" não é primo");
		}
		

	}

}
