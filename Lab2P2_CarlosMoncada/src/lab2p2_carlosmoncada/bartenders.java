/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_carlosmoncada;

/**
 *
 * @author calol
 */
public class bartenders {
String  nombre;
int edad;
String turno;
double sueldo; 
int cantlicores;

    public bartenders(String nombre, int edad, String turno, double sueldo, int cantlicores) {
        this.nombre = nombre;
        this.edad = edad;
        this.turno = turno;
        this.sueldo = sueldo;
        this.cantlicores = cantlicores;
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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getCantlicores() {
        return cantlicores;
    }

    public void setCantlicores(int cantlicores) {
        this.cantlicores = cantlicores;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + "Edad=" + edad + "Turno=" + turno + "Sueldo=" + sueldo + "Cantlicores=" + cantlicores ;
    }
    

}
