package desafios;
/*
 *  Implemente um método que calcule os primeiros N termos da sequência de Fibonacci 
 *  e salve em um vetor. Ao final imprima o vetor resultante.
 * */
import java.util.Scanner;
public class Desafio04 {

	/*
	 * Na matemática, os números de Fibonacci são uma sequência ou sucessão definida como recursiva pela
       fórmula:
       F(n + 2) = F(n + 1) + F(n) , com n ≥ 1 e F(1) = F(2) = 1 .
	 * */
	public static long fibo(int n) {
		if(n < 2) {
			return n;
		}else {
			return fibo(n - 1)+fibo(n - 2);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite o um numero: ");
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    while(!(n > 2)) {
	    	System.out.println("Digite um numero maior que 1");
	    	n = sc.nextInt();
	    }
	    
	    for(int i = 0; i <= n; i++) {
	    	System.out.println("("+i+"): "+fibo(i));
	    }
	}

}

