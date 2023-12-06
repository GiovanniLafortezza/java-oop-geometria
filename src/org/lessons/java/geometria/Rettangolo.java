package org.lessons.java.geometria;

public class Rettangolo {
    //ATTRIBUTI
    int base;
    int height;

    //COSTRUTTORI

    public Rettangolo(int base, int height) {
        this.base = base;
        this.height = height;
    }

    //METODI

    int perimetro() {
        int valuePerimetro = (base * 2) + (height * 2);
        return valuePerimetro;
    }

    int area() {
        int valueArea = base * height;
        return valueArea;
    }

    @Override
    public String toString() {
        return "Rettangolo {" +
                "base=" + base +
                ", height=" + height +
                '}';
    }

    void printRectangle() {
        printHorizontal();
        for (int i = 0; i < height - 2; i++) {
            printVertical();
        }
        printHorizontal();
    }

    void printHorizontal() {
        for (int i = 0; i < base - 1; i++) {
            System.out.print("x");
        }
        System.out.println("x");
    }

    void printVertical() {
        System.out.print("x");
        for (int i = 0; i < base - 2; i++) {
            System.out.print(" ");
        }
        System.out.println("x");
    }
}
