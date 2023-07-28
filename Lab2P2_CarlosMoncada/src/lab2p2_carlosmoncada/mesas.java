/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_carlosmoncada;

/**
 *
 * @author calol
 */
public class mesas {
int numplatos;
int numutensilios;
double preciototal;

    public mesas(int numplatos, int numutensilios, double preciototal) {
        this.numplatos = numplatos;
        this.numutensilios = numutensilios;
        this.preciototal = preciototal;
    }

    public int getNumplatos() {
        return numplatos;
    }

    public void setNumplatos(int numplatos) {
        this.numplatos = numplatos;
    }

    public int getNumutensilios() {
        return numutensilios;
    }

    public void setNumutensilios(int numutensilios) {
        this.numutensilios = numutensilios;
    }

    public double getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(double preciototal) {
        this.preciototal = preciototal;
    }

    @Override
    public String toString() {
        return "Numero de platos=" + numplatos + "Numero de utensilios=" + numutensilios + "Preciototal=" + preciototal ;
    }
    

}
