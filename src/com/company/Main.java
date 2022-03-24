package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static boolean verificaNumeroPrimo(int n) {
        int a;
        for (a = 2; a < n; a++) {
            if (n % a == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("INSERIRE UN NUMERO COMPRESO TRA DUE ESTREMI DATI E IMPOSTATI DA PROGRAMMA E VERIFICA CHE SIA " +
                "UN NUMERO PRIMO");
        Scanner tastiera = new Scanner(System.in);
        int estr_min = 0;
        int estr_max = 999999;
        int numero_acquisito;
        try {
            System.out.println("\nINSERIRE UN NUMERO COMPRESO TRA " + estr_min + " E " + estr_max);
            numero_acquisito = tastiera.nextInt();
            if (numero_acquisito > estr_min && numero_acquisito < estr_max) {
                if (verificaNumeroPrimo(numero_acquisito)) {
                    System.out.println("\nIL NUMERO-->  " + numero_acquisito + " E' UN NUMERO PRIMO");
                } else {
                    System.out.println("\nIL NUMERO-->  " + numero_acquisito + " NON E' UN NUMERO PRIMO");
                }
            }
        } catch (InputMismatchException message) {
            System.err.println("HAI INSERITO UN NUMERO INTERO FUORI DAL RANGE...PROGRAMMA TERMINATO");
            message.printStackTrace();
        }
        tastiera.close();
    }

}


