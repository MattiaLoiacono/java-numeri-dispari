package org.generation.italy.cicli;

import java.util.Scanner;
import java.util.Random;

public class StampaNumeriDispari {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Inserire lunghezza array: ");
		int n=input.nextInt(), max=100;
		int[] numeriRandom = new int[n];
		Random rand = new Random();
		
		for (int i = 0; i < n; i++) {
			numeriRandom[i] = rand.nextInt(max);
			
			if (numeriRandom[i] % 2 != 0) {
				System.out.print(numeriRandom[i] + " ");
			}
		}
		input.close();
	}
}
