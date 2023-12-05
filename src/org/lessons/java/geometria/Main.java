package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert the value of the base: ");
        int inputBase = scanner.nextInt();

        System.out.print("Insert the value of the height: ");
        int inputHeight = scanner.nextInt();

        Rettangolo rettangolo1 = new Rettangolo(inputBase, inputHeight);
        String rettangolo1string = rettangolo1.toString();

        System.out.println(rettangolo1);
        System.out.println("Perimetro = " + rettangolo1.perimetro());
        System.out.println("Area = " + rettangolo1.area());

        rettangolo1.disegna();
        System.out.println(rettangolo1);
        scanner.close();
    }
}
