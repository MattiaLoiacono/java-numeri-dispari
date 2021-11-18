package org.generation.italy.cicli;

import java.util.Scanner;
import java.util.Random;

public class StampaNumeriDispari {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Inserire lunghezza array: ");
		int n=input.nextInt(), max=100, dispari=0, somma=0;
		int[] numeriRandom = new int[n];
		Random rand = new Random();
		
		for (int i = 0; i < n; i++) {
			numeriRandom[i] = rand.nextInt(max);
			
			if (numeriRandom[i] % 2 != 0) {
				System.out.print(numeriRandom[i] + " ");
				dispari++;
			}
			
			if (numeriRandom[i] > 10 && numeriRandom[i] < 50) {
				somma += numeriRandom[i];
			}
			
		}
		
		System.out.println("\nSono presenti " + dispari + " numeri dispari e " + (n-dispari) + " numeri pari");
		System.out.println("La somma dei numeri compresi tra 10 e 50 è: " + somma);
		
		input.close();
	}
}
