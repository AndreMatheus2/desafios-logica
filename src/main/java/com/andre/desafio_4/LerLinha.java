package com.andre.desafio_4;

import java.util.Scanner;

public class LerLinha {
    public static String readLine(Scanner leitor) {
        String line = leitor.nextLine();
        while (line.isEmpty())
            line = leitor.nextLine();
        return line;
    }
}
