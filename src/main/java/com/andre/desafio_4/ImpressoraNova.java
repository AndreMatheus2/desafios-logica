// Texto para ser digitado no console:

//        5
//        I ENIL SIHTHSIREBBIG S
//        LEVELKAYAK
//        H YPPAHSYADILO
//        ABCDEFGHIJKLMNOPQRSTUVWXYZ
//        VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE
package com.andre.desafio_4;

import java.util.Scanner;
public class ImpressoraNova {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        System.out.println();
        System.out.println();
        for (int i = 0; i < N; i++) {
            String frase = LerLinha.readLine(leitor);
            StringBuilder parte1 = new StringBuilder(frase.substring(0, frase.length() / 2));
            StringBuilder parte2 = new StringBuilder(frase.substring(frase.length() / 2, frase.length()));
            parte1.reverse();
            parte2.reverse();
            System.out.println(parte1.toString() + parte2.toString());
        }
    }
}