package desafios;
/*
 * 13 - Escreva um programa que, dada uma duração de tempo em segundos, 
 * calcule o número equivalente de dias, horas, minutos e segundos.
 * Por exemplo, 123554 segundos equivalem a 1 dia, 10 horas, 19 
 * minutos e 14 segundos.
 * */

public class Desafio13 {

	public static void main(String[] args) {
		int duracaoSegundos = (int) Math.floor(Math.random()*999999999);
		
		int dias = duracaoSegundos / (24 * 3600);
		int restoDias = duracaoSegundos % (24 * 3600);  
		int horas = restoDias / 3600;
		int restoHoras = restoDias % 3600;
		int minutos = restoHoras / 60;
		int segundos = restoHoras % 60;
		
		System.out.println(duracaoSegundos+" segudos equivalem a "+
		             dias+" dias, "+horas+" horas, "+minutos+" minutos e "+segundos+" segundos.");
	}

}
