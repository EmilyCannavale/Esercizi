package com.acn.emily;

import java.util.Arrays;

public class Esercizio13 {
	
	public static void main(String[] args) {

        // TODO Auto-generated method stub

        

        // Dichiarazione dei due array da confrontare

        int[] primoArray = {1, 2, 3, 4, 5};

        int[] secondoArray = {2, 7, 4, 8, 5};

 

        // Confronto dei due array

        boolean sonoUguali = Arrays.equals(primoArray, secondoArray);

 

        if (sonoUguali) {

            System.out.println("I due array sono uguali");

        } else {

            System.out.println("I due array sono diversi");

        }

	}
}
