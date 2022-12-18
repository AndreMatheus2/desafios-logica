package com.andre.desafio_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class DiferencaValorAlvo {
    public static void main(String[] args)  throws Exception {

        Scanner ler = new Scanner(System.in);
        int n;

        System.out.printf("Informe o tamanho do lista:");
        n = ler.nextInt();

        ArrayList<Integer> array = new ArrayList<>();

        System.out.println("Informe os numeros da lista:");
        for (int i = 0; i < n; i++) {
            array.add(ler.nextInt());

        }
        Collections.sort(array);

        System.out.println("INFORME O VALOR ALVO: ");
        ler = new Scanner(System.in);
        int valor = ler.nextInt();

        int aux = 0;
        int tamanhoArray = array.size() + 1;
        int index = array.get(0);
        for (int j = 0; j <= tamanhoArray; j++){
            int subtracao = array.size() - index;
            if (subtracao == valor) {
                    aux++;
                    index++;
            }while (subtracao != valor && tamanhoArray != 0){
                tamanhoArray--;
                int subtracao2 = tamanhoArray - index;
                if (subtracao2 == valor){
                    index++;
                    aux++;
                    break;
                }
            }
            if (tamanhoArray == 0){
                tamanhoArray = array.size() + 1;
            }
        }
        System.out.println("TOTAL: " + aux);
        ler.close();

    }
}
