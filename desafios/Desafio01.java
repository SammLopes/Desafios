/**
 * @author Samuel Lopes
 * */
/*
 * Escrever um programa que calcule
 *  o fatorial de n iterativamente, para n>0.
 * */
package com.desafios;
import java.util.Scanner;
public class Desafio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com um numero");
		int num = sc.nextInt();
		int fat = 1;
		for(int i = num; i >= 1;i--) {
			fat = fat * i;
			System.out.println(i);
		}
		System.out.println("O fatorial do nuemro "+num+" é "+fat);
	}

}
