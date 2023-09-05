package com.acn.emily;

import java.util.ArrayList;
import java.util.Arrays;

public class Esercizio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/* Scrivere un programma Java per rimuovere il terzo elemento da un elenco di array*/

		int num1 = 22;

        int num2 = 44;

        int num3 = 55;

        int num4 = 66;

        int num5 = 77;

        

        ArrayList <Integer> elenco = new ArrayList <Integer> ();

        

        elenco.add(num1);

        elenco.add(num2);

        elenco.add(num3);

        elenco.add(num4);

        elenco.add(num5);

        

        System.out.println("Stampo l'array iniziale: ");

        for (int i=0; i<elenco.size(); i++) {

            System.out.println(elenco.get(i));

        }

        

        //rimuovo il terzo elemento

        

        elenco.remove(2);

        System.out.println("Stampo l'array considerando la rimozione del terzo elemento");

        for (int i=0; i<elenco.size(); i++) {

            System.out.println(elenco.get(i));

            

        }
	}

}
