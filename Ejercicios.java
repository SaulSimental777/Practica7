package com.company;

import java.util.Random;
import java.util.Arrays;
public class Ejercicios {
    public static void main(String[] args){
        Random random = new Random();
        Objeto ob=new Objeto(3,2,1);
        //Ej1
        System.out.println("Ejercicio 1");
        int[] integerArray1 = {1,20,3,44,5,60,7,88,9,100};
        System.out.println(integerArray1[4]);

        //Ej2
        System.out.println("Ejercicio 2");
        int[] integerArray2 = new int[5] ;
        System.out.println(Arrays.toString(integerArray2));

        int[] integerArray3=  new int[5];
        for (int i = 0; i < integerArray3.length; i++) {
            integerArray3[i] = random.nextInt();
            System.out.println(integerArray3[i]);
        }

        //Ej3
        System.out.println("Ejercicio 3");
        Objeto[] integerArray4=new Objeto[1];
        integerArray4[0]=ob;
        System.out.println(integerArray4[0]);

        Objeto[] integerArray5;
        integerArray5= new Objeto[1];
        integerArray5[0]= new Objeto(10,5,3);
        integerArray5[0].display();

        //Ej4
        //la clase Object contiene a toString() puede ser util al querer obtener un objeto dentro de un arreglo,
        // convirtiendo el codigo que regresa java a String
        System.out.println("Ejercicio 4");
        Dog wua=new Dog("Miguel",10);
        wua.eat();
        System.out.println(wua.name+" "+wua.age);


        //Ej5
        System.out.println("Ejercicio 5");
        Lobo au=new Lobo("Nocturne",3);
        au.aullar();



    }
}
class Objeto{
    public int hojas;
    public int lapices;
    public int plumas;


    Objeto(int hojas, int lapices, int plumas){
        this.hojas=hojas;
        this.lapices=lapices;
        this.plumas=plumas;
    }



    public void display(){
        System.out.println("Hojas son: " +hojas +" ,"+"Lapices son: " +lapices+" ,"+ "Plumas son: " + plumas);
    }
    public String toString(){
        return "Hojas son: " +hojas +" ,"+"Lapices son: " +lapices+" ,"+ "Plumas son: " + plumas;
    }
}

class Animal {
    String name;
    int age;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println(name + " is eating");
    }
    public void sleep(){
        System.out.println(name+ "is sleeping");
    }

}

class Dog extends Animal{
    public Dog (String name, int age){
        super(name,age);
    }
    public void bark(){
        System.out.println(name + ": woof woof");

    }
    public String toString(){
        return name + age;
    }

}

class Lobo extends Animal{
    public Lobo (String name, int age){
        super(name,age);
    }
    public void aullar(){
        System.out.println(name + ": AUUUUUU");

    }


}

