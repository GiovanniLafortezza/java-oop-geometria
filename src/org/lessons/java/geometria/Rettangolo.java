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
        int valueArea = (base * height) / 2;
        return valueArea;
    }
}
