package com.acn.emily;

import java.util.Scanner;

public class Esercizio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scrivere un programma Java per aggiornare l'elemento specifico

        dell'array in base all'elemento specificato.*/

   

       Scanner scanner = new Scanner(System.in);

       

       int [] elenco = {6, 8, 12, 10, 4};

       System.out.println("Inserisci un numero");

       int precedente = scanner.nextInt();

       System.out.println("Inserisci un altro numero");

       int sucessivo = scanner.nextInt();

       

       System.out.println("Elenco aggiornato ");

       for(int elementi : elenco) {

           if(elementi == precedente) {

               elementi = sucessivo;

           }System.out.println(elementi);

       }

	}

}
