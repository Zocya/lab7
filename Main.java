package com.company;

public class Main {

    public static void main(String[] args) {
        Domkrat domkrat = new Domkrat();
        System.out.println(domkrat);
        Domkrat domkrat1 = new Domkrat(4, "sobaka", "red", 7);
        System.out.println(domkrat1);
        Domkrat domkrat2 = new Domkrat(4, "sobaka", "red", 7, "meat",
                "dog");
        System.out.println(domkrat2);
    }
}
