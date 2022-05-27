package com.company;


public class Bird {
    public String nombre;
    public String color;
    public String vida;
    public String ataque;

    public Bird(String nombre,String color, String vida,String ataque){
        this.nombre=nombre;
        this.color=color;
        this.vida=vida;
        this.ataque=ataque;
    }

    public Bird() {

    }

    public void setNombre(String nombre){

        this.nombre = nombre;
    }
    public String getNombre(){

        return nombre;
    }

    public void setColor(String color){

        this.color = color;
    }
    public String getColor(){

        return color;
    }

    public void setVida(String vida){

        this.vida = vida;
    }

    public String getVida(){

        return vida;
    }
    public void setAtaque(String ataque){

        this.ataque = ataque;
    }
    public String getAtaque(){

        return ataque;
    }

}
class Ice extends Bird{

    private String poder;
    private String nivel;


    public Ice (String nombre,String color, String vida,String ataque,String poder,String nivel){

        super (color, nombre, vida,ataque);
        this.poder = poder;
        this.nivel = nivel;
    }

    public Ice() {

        super();
    }

    public void setPoder(String poder){
        this.poder=poder;

    }
    public String getPoder(){

        return poder;
    }

    public void setNivel(String nivel){
        this.nivel= String.valueOf(nivel);

    }
    public String getNivel(){

        return nivel;
    }


}

class Bubbles extends Bird {
    private String poder;
    private String nivel;

    public Bubbles(String nombre,String color, String vida,String ataque,String poder,String nivel) {

        super(color, nombre, vida,ataque);
        this.poder = poder;
        this.nivel = nivel;
    }

    public Bubbles() {
    }

    public void setPoder(String poder){
        this.poder=poder;

    }
    public String getPoder(){

        return poder;
    }

    public void setNivel(String nivel){
        this.nivel=nivel;

    }
    public String getNivel(){

        return nivel;
    }


}
class Red extends Bird {
    private String poder;
    private String nivel;

    public Red(String nombre,String color, String vida,String ataque,String poder,String nivel) {
        super(color, nombre, vida,ataque);
        this.poder = poder;
        this.nivel = nivel;
    }

    public Red() {

    }

    public void setPoder(String poder){
        this.poder=poder;

    }
    public String getPoder(){

        return poder;
    }

    public void setNivel(String nivel){
        this.nivel=nivel;

    }
    public String getNivel(){
        return nivel;
    }


}
