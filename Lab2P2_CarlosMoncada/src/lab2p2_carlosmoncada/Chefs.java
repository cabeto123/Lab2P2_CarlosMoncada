/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_carlosmoncada;

/**
 *
 * @author calol
 */
public class Chefs {
String nombre;
int edad;
String turno;
int estrellasmichelin;
double sueldo;

    public Chefs(String nombre, int edad, String turno, int estrellasmichelin, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.turno = turno;
        this.estrellasmichelin = estrellasmichelin;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getEstrellasmichelin() {
        return estrellasmichelin;
    }

    public void setEstrellasmichelin(int estrellasmichelin) {
        this.estrellasmichelin = estrellasmichelin;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return  "Nombre=" + nombre + " Edad=" + edad + "Turno=" + turno + "Estrellasmichelin=" + estrellasmichelin + "Sueldo=" + sueldo ;
    }
    

}
