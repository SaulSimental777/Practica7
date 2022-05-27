package com.company;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Ice n1= new Ice();
        n1.setNombre("Ice");
        n1.setColor("Azul");
        n1.setVida("86");
        n1.setAtaque("Ice gira y congela a su alrededor!");
        n1.setPoder("27");
        n1.setNivel("10");

        Bubbles n2= new Bubbles();
        n2.setNombre("Bubbles");
        n2.setColor("Amarillo");
        n2.setVida("100");
        n2.setAtaque("Bubbles Se infla y explota!");
        n2.setPoder("14");
        n2.setNivel("2");


        Red n3= new Red();
        n3.setNombre("Red");
        n3.setColor("Rojo");
        n3.setVida("10");
        n3.setAtaque("Red sale disparado y choca contra el enemigo!");
        n3.setPoder("31");
        n3.setNivel("20");

        Scanner sn = new Scanner(System.in);
        System.out.println(" Seleccione un personaje a usar  ");
        System.out.println("1. Ice");
        System.out.println("2. Bubbles");
        System.out.println("3. Red");
        System.out.println("4. Salir");

        int i=sn.nextInt();
        switch (i) {
            case 1:
                System.out.println("Nombre: " + n1.getNombre());
                System.out.println("Color: " + n1.getColor());
                System.out.println("Vida: " + n1.getVida());
                System.out.println("Ataque: " + n1.getAtaque());
                System.out.println("Poder: " + n1.getPoder());
                System.out.println("Nivel: " + n1.getNivel());

                break;

            case 2:
                System.out.println("Nombre: " + n2.getNombre());
                System.out.println("Color: " + n2.getColor());
                System.out.println("Vida: " + n2.getVida());
                System.out.println("Ataque: " + n2.getAtaque());
                System.out.println("Poder: " + n2.getPoder());
                System.out.println("Nivel: " + n2.getNivel());

                break;

            case 3:
                System.out.println("Nombre: " + n3.getNombre());
                System.out.println("Color: " + n3.getColor());
                System.out.println("Vida: " + n3.getVida());
                System.out.println("Ataque: " + n3.getAtaque());
                System.out.println("Poder: " + n3.getPoder());
                System.out.println("Nivel: " + n3.getNivel());
                break;
            default:
                break;

        }

    }
}
