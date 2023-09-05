package com.acn.emily;

import java.util.Arrays;

public class Esercizio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scrivere un programma Java per unire due elenchi di array.

		// Dichiarazione e inizializzazione dei due array da unire

        int[] primoArray = {10, 2, 4};

        int[] secondoArray = {12, 5, 8};

 

        int lunghezzaRisultante = primoArray.length + secondoArray.length;

 

        int[] arrayRisultante = new int[lunghezzaRisultante];


        // Copio gli elementi del primo array nell'array risultante

        for (int i = 0; i < primoArray.length; i++) {

            arrayRisultante[i] = primoArray[i];

        }

 

        // Copio gli elementi del secondo array nell'array risultante

        for (int i = 0; i < secondoArray.length; i++) {

            arrayRisultante[primoArray.length + i] = secondoArray[i];

        }

 

        // Stampo l'array risultante

        System.out.println("Array risultante: " + Arrays.toString(arrayRisultante));
	}

}
