package com.acn.emily;

import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scrivere un programma Java per recuperare un elemento

	    (in corrispondenza di un indice specificato) da un dato elenco di array.

	     */
		    int [] elenco = {4,5,7,2,8,16};


	        Scanner scanner = new Scanner(System.in);

	        

	        System.out.println("Quale elemento vuoi recuperare?");

	        int x = scanner.nextInt();

	        

	        System.out.println("Elemento recuperato: " + elenco[x]);

	}

}
