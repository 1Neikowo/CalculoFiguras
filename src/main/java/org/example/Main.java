package org.example;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static double perimetroCuadrado(double lado) {
        return lado * 4;
    }

    public static double areaCuadrado(double lado) {
        return lado * lado;
    }

    public static double perimetroRectangulo(double base, double altura) {
        return base * 2 + altura * 2;
    }

    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double perimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    public static double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double areaEsfera(double radio) {
        return 4 * Math.PI * radio * radio;
    }

    public static double volumenEsfera(double radio) {
        return Math.PI * Math.pow(radio, 3) * (double) 4 / 3;
    }

    public static double areaCubo(double lado) {
        return 6 * lado * lado;
    }

    public static double volumenCubo(double lado) {
        return lado * lado * lado;
    }

    public static double areaCono(double radio, double altura) {
        return Math.PI * radio * (radio + (sqrt(radio * radio + altura * altura)));
    }

    public static double volumenCono(double radio, double altura) {
        return (Math.PI * altura * radio * radio) / 3;
    }

    public static int pedirInt() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una opcion");
        int ans=0;
        try {
            ans = teclado.nextInt();
        }catch (Exception e) {
            System.out.println("Opción no válida");
            pedirInt();
        }


        return ans;
    }


    public static void menu() {
        System.out.println("1. Calcular el perimetro de un cuadrado");
        System.out.println("2. Calcular el area de un cuadrado");
        System.out.println("3. Calcular el perimetro de un rectangulo");
        System.out.println("4. Calcular el area de un rectangulo");
        System.out.println("5. Calcular el perimetro de un circulo");
        System.out.println("6. Calcular el area de un circulo");
        System.out.println("7. Calcular el area de una esfera");
        System.out.println("8. Calcular el volumen de una esfera");
        System.out.println("9. Calcular el area de un cubo");
        System.out.println("10. Calcular el volumen de un cubo");
        System.out.println("11. Calcular el area de un cono");
        System.out.println("12. Calcular el volumen de un cono");
        System.out.println("13. Salir");
        int ans = pedirInt();
        llamarMetodos(ans);
    }
    public static void llamarMetodos(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el lado del cuadrado: ");
                double lado = pedirDouble();
                System.out.println("El perimetro del cuadrado es: " + perimetroCuadrado(lado));
                break;
            case 2:
                System.out.println("Ingrese el lado del cuadrado: ");
                lado = pedirDouble();
                System.out.println("El area del cuadrado es: " + areaCuadrado(lado));
                break;
            case 3:
                System.out.println("Ingrese la base del rectangulo: ");
                double base = pedirDouble();
                System.out.println("Ingrese la altura del rectangulo: ");
                double altura = pedirDouble();
        }
    }
}