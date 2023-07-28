/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_carlosmoncada;

import java.util.ArrayList;
import java.util.Scanner;
import javax.lang.model.util.ElementFilter;
import javax.swing.JOptionPane;

/**
 *
 * @author calol
 */
public class Lab2P2_CarlosMoncada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Chefs> chefs = new ArrayList<Chefs>();
        ArrayList<meseros> meseros = new ArrayList<meseros>();
        ArrayList<bartenders> Bartenders = new ArrayList<bartenders>();
        ArrayList<mesas> Mesas = new ArrayList<mesas>();
        int opcionentrada = 0;
        System.out.println("1-Iniciar sesion");
        System.out.println("2-Salir");
        opcionentrada = entrada.nextInt();

        switch (opcionentrada) {
            case 1:
                System.out.println("Digite su usuario");
                String usuario = entrada.nextLine();
                usuario = entrada.nextLine();
                System.out.println("Digite la contrasenia");
                String contraseña = entrada.nextLine();
                if (usuario.equalsIgnoreCase("gerente") && contraseña.equalsIgnoreCase("g3r$nt0")) {
                    opcionentrada = 0;
                    while (opcionentrada != 5) {
                        System.out.println("\n\n\n");
                        System.out.println("Opciones");
                        System.out.println("1-Chefs");
                        System.out.println("2-Meseros");
                        System.out.println("3-Bartenders");
                        System.out.println("4-Mesas");
                        System.out.println("5-Salir");
                        opcionentrada = entrada.nextInt();
                        switch (opcionentrada) {
                            case 1:
                                System.out.println("\n\n");
                                System.out.println("Menu chef");
                                System.out.println("1-Crear\n2- Modificar\n3-Eliminar,\n4-Listar Chefs.");
                                int opcionchef = entrada.nextInt();
                                while (opcionchef < 0 || opcionchef > 4) {
                                    System.out.println("Opcion fuera de rango");
                                    System.out.println("1-Crear\n2- Modificar\n3-Eliminar,\n4-Listar Chefs.");
                                    opcionchef = entrada.nextInt();
                                }
                                switch (opcionchef) {
                                    case 1:
                                        if (chefs.size()<14) {
                                        
                                        chefs.add(crearchef(chefs));    
                                            if (chefs.get(chefs.size()-1).getEdad()==0) {
                                                chefs.remove(chefs.size()-1);
                                            }else{
                                            System.out.println("Chef agregado correctamente");
                                            }
   
                                        }else{
                                            System.out.println("Chefs completos");
                                        }
                                        
                                        
                                        
                                        break;
                                    case 2:
                                        if (chefs.size() > 0) {
                                            Modificarchef(chefs);
                                            System.out.println("");
                                            System.out.println("");
                                            System.out.println("Chefs modificado correctamente");
                                        } else {
                                            System.out.println("No hay chefs");
                                        }

                                        break;
                                    case 3:
                                        if (chefs.size()>0) {
                                        int poseliminar = eliminarchef(chefs);
                                        chefs.remove(poseliminar);
                                        System.out.println("Chef eliminado correctamente");    
                                        }
                                        break;
                                        
                                    case 4:
                                        if (chefs.size()>0) {
                                        listarchef(chefs);    
                                        }
                                        
                                        break;

                                }

                                break;
                            case 2:
                                System.out.println("\n\n");
                                System.out.println("Menu meseros");
                                System.out.println("1-Crear\n2- Modificar\n3-Eliminar,\n4-Listar meseros.");
                                int opcionmeseros = entrada.nextInt();
                                while (opcionmeseros < 0 || opcionmeseros > 4) {
                                    System.out.println("Opcion fuera de rango");
                                    System.out.println("1-Crear\n2- Modificar\n3-Eliminar,\n4-Listar meseros.");
                                    opcionmeseros = entrada.nextInt();
                                }
                                switch (opcionmeseros) {
                                    case 1:
                                        meseros.add(crearMeseros(meseros));
                                        if (meseros.get(meseros.size()-1).getEdad()==0) {
                                            meseros.remove(meseros.size()-1);
                                        }else{
                                        System.out.println("Mesero agregado correctamente");
                                        }
                                        
                                        break;
                                    case 2:
                                        if (meseros.size() > 0) {
                                            if (meseros.size()<8) {
                                            Modificarmeseros(meseros);
                                            System.out.println("");
                                            System.out.println("");
                                            System.out.println("Meseros modificado correctamente");    
                                            }else{
                                                System.out.println("Ya no se pueden agregar meseros");
                                            }
                                            
                                        } else {
                                            System.out.println("No hay Meseros");
                                        }

                                        break;
                                    case 3:
                                        if (meseros.size()>0) {
                                         
                                        int poseliminar = eliminarmeseros(meseros);
                                        meseros.remove(meseros);
                                        System.out.println("Meseros eliminado correctamente");   
                                        }
                                        break;
                                    case 4:
                                        if (meseros.size()>0) {
                                        listarmeseros(meseros);    
                                        }
                                        
                                        break;

                                }

                                break;
                            case 3:
                                System.out.println("\n\n");
                                System.out.println("Menu Bartender");
                                System.out.println("1-Crear\n2- Modificar\n3-Eliminar,\n4-Listar Bartender.");
                                int opcionbartender = entrada.nextInt();
                                while (opcionbartender < 0 || opcionbartender > 4) {
                                    System.out.println("Opcion fuera de rango");
                                    System.out.println("1-Crear\n2- Modificar\n3-Eliminar,\n4-Listar Bartender.");
                                    opcionbartender = entrada.nextInt();
                                }
                                switch (opcionbartender) {
                                    case 1:
                                        if (Bartenders.size()<4) {
                                        Bartenders.add(crearBartender(Bartenders));
                                        if (Bartenders.get(Bartenders.size()-1).getEdad()==0) {
                                            Bartenders.remove(Bartenders.size()-1);
                                        }else{
                                        System.out.println("Bartender agregado correctamente");
                                        }    
                                        }else{
                                            System.out.println("No se pueden crear mas bartender");
                                        }
                                        
                                        
                                        break;
                                    case 2:
                                        if (Bartenders.size() > 0) {
                                            Modificarbartenders(Bartenders);
                                            System.out.println("");
                                            System.out.println("");
                                            System.out.println("Bartenders modificado correctamente");
                                        } else {
                                            System.out.println("No hay Bartenders");
                                        }

                                        break;
                                    case 3:
                                        int poseliminar = eliminarbartender(Bartenders);
                                        if (Bartenders.size()>0) {
                                        Bartenders.remove(poseliminar);    
                                        System.out.println("Bartenders eliminado correctamente");
                                        }
                                        
                                        break;
                                    case 4:
                                        if (Bartenders.size()>0) {
                                        listarbartender(Bartenders);    
                                        }
                                        
                                        break;

                                }

                                break;
                            case 4:System.out.println("\n\n");
                                System.out.println("Menu Mesas");
                                System.out.println("1-Crear\n2- Modificar\n3-Eliminar\n4-Listar Mesas\n5-Suma total");
                                int opcionmesas = entrada.nextInt();
                                while (opcionmesas < 0 || opcionmesas > 5) {
                                    System.out.println("Opcion fuera de rango");
                                    System.out.println("1-Crear\n2- Modificar\n3-Eliminar\n4-Listar Mesas\n5-Suma total");
                                 opcionmesas = entrada.nextInt();
                                }
                                switch (opcionmesas) {
                                    case 1:
                                        if (Mesas.size()<10) {
                                        Mesas.add(crearMesa());
                                        System.out.println("Mesas agregada correctamente");    
                                        }
                                        
                                        break;
                                    case 2:
                                        if (Mesas.size() > 0) {
                                            Modificarmesa(Mesas);
                                            System.out.println("");
                                            System.out.println("");
                                            System.out.println("Mesas modificado correctamente");
                                        } else {
                                            System.out.println("No hay mesas");
                                        }

                                        break;
                                    case 3:
                                        int poseliminar = eliminarmesas(Mesas);
                                        Mesas.remove(poseliminar);
                                        System.out.println("Mesas eliminado correctamente");
                                        break;
                                    case 4:
                                        listarmesas(Mesas);
                                        break;
                                    case 5:sumaprecio(Mesas);
                                    break;

                                }

                                break;
                        }
                    }

                } else {
                    System.out.println("Usuario o contraseña incorrecta");
                }
                break;
            case 2:

        }

    }//fin del main

    public static Chefs crearchef(ArrayList<Chefs> chefs ) {
        ArrayList<Chefs> aux= new ArrayList();
        aux.addAll(chefs);
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String turno;
        int estrellasmichelin;
        double sueldo;
        System.out.println("\n\n\n");
        System.out.println("Digite el nombre del chef");
        nombre = entrada.nextLine();
        System.out.println("Digite su edad");
        edad = entrada.nextInt();
        while (edad <= 0) {
            System.out.println("Edad no puede ser negativa");
            System.out.println("Digite su edad");
            edad = entrada.nextInt();
        }
        System.out.println("\nTurnos\n1-Matutino\n2-Vespertino");
        int turnonum = entrada.nextInt();
        while (turnonum < 1 || turnonum > 2) {
            System.out.println("Numero fuera de rango");
            System.out.println("\n\nTurnos\n1-Matutino\n2-Vespertino");
            turnonum = entrada.nextInt();

        }
        System.out.println("Digite las estrellas michelin");
        estrellasmichelin = entrada.nextInt();
        while (estrellasmichelin < 0) {
            System.out.println("Estrellasmichelin no puede ser negativa");
            System.out.println("Digite las estrellas michelin");
            estrellasmichelin = entrada.nextInt();
        }
        System.out.println("Digite su sueldo");
        sueldo = entrada.nextDouble();
        while (sueldo < 0) {
            System.out.println("Sueldo no puede ser negativa");
            System.out.println("Digite su sueldo");
            sueldo = entrada.nextDouble();
        }
        
        if (turnonum == 1) {
            turno = "matutino";
            
        } else {
            turno = "vespertino";
        }
        
        aux.add(new Chefs(nombre, edad, turno, estrellasmichelin, sueldo)) ;
        
        boolean validarmatutino= validarmatutinochefs(aux);
        boolean validarvespertino= validarvespertinochef(aux);
        if (validarvespertino==false) {
            
            System.out.println("Ya hay 7 vespertino");
        }else if(validarmatutino==false){
       
            System.out.println("Ya hay 7 matutino");
        }
        
        if (validarvespertino==true&&validarmatutino==true) {
            aux.removeAll(aux);
            return new Chefs(nombre, edad, turno, estrellasmichelin, sueldo);
        }else{
            aux.removeAll(aux);
        return new Chefs("", 0, "", 0, 0);
        }
        
    }

    public static void Modificarchef(ArrayList<Chefs> chefs) {
        Scanner entrada = new Scanner(System.in);
        listarchef(chefs);
        System.out.println("Escoja una la posicion");
        int pos = entrada.nextInt();
        while (pos < 0 || pos > chefs.size() - 1) {
            System.out.println("Numero fuera de rango");
            System.out.println("Escoja una la posicion");
            pos = entrada.nextInt();
        }
        String nombre;
        int edad;
        String turno;
        int estrellasmichelin;
        double sueldo;
        System.out.println("\n\n\n");
        System.out.println("Digite el nombre del chef");
        nombre = entrada.nextLine();
        nombre = entrada.nextLine();
        System.out.println("Digite su edad");
        edad = entrada.nextInt();
        while (edad <= 0) {
            System.out.println("Edad no puede ser negativa");
            System.out.println("Digite su edad");
            edad = entrada.nextInt();
        }
        System.out.println("\nTurnos\n1-Matutino\n2-Vespertino");
        int turnonum = entrada.nextInt();
        while (turnonum < 1 || turnonum > 2) {
            System.out.println("Numero fuera de rango");
            System.out.println("\n\nTurnos\n1-Matutino\n2-Vespertino");
            turnonum = entrada.nextInt();

        }
        System.out.println("Digite las estrellas michelin");
        estrellasmichelin = entrada.nextInt();
        while (estrellasmichelin < 0) {
            System.out.println("Estrellasmichelin no puede ser negativa");
            System.out.println("Digite las estrellas michelin");
            estrellasmichelin = entrada.nextInt();
        }
        System.out.println("Digite su sueldo");
        sueldo = entrada.nextDouble();
        while (sueldo < 0) {
            System.out.println("Sueldo no puede ser negativa");
            System.out.println("Digite su sueldo");
            sueldo = entrada.nextDouble();
        }
        if (turnonum == 1) {
            turno = "matutino";
        } else {
            turno = "vespertino";
        }
        chefs.get(pos).setEdad(edad);
        chefs.get(pos).setEstrellasmichelin(estrellasmichelin);
        chefs.get(pos).setNombre(nombre);
        chefs.get(pos).setSueldo(sueldo);
        chefs.get(pos).setTurno(turno);

    }

    public static int eliminarchef(ArrayList<Chefs> chefs) {
        Scanner entrada = new Scanner(System.in);
        listarchef(chefs);
        System.out.println("Digite la posicion a eliminar");
        int pos = entrada.nextInt();
        while (pos < 0 || pos > chefs.size() - 1) {
            System.out.println("Numero fuera de rango");
            System.out.println("Escoja una la posicion");
            pos = entrada.nextInt();
        }

        return pos;
    }

    public static void listarchef(ArrayList<Chefs> chefs) {
        for (int i = 0; i < chefs.size(); i++) {
            System.out.println("Posicion " + i + " " + chefs.get(i));
            System.out.println("");
            System.out.println("");
        }

    }

    public static meseros crearMeseros(ArrayList<meseros> Meseros) {
        ArrayList<meseros> aux= new ArrayList();
        aux.addAll(Meseros);
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String turno;
        double sueldo;
        double propina;
        System.out.println("\n\n\n");
        System.out.println("Digite el nombre del Mesero");
        nombre = entrada.nextLine();
        System.out.println("Digite su edad");
        edad = entrada.nextInt();
        while (edad <= 0) {
            System.out.println("Edad no puede ser negativa");
            System.out.println("Digite su edad");
            edad = entrada.nextInt();
        }
        System.out.println("\nTurnos\n1-Matutino\n2-Vespertino");
        int turnonum = entrada.nextInt();
        while (turnonum < 1 || turnonum > 2) {
            System.out.println("Numero fuera de rango");
            System.out.println("\n\nTurnos\n1-Matutino\n2-Vespertino");
            turnonum = entrada.nextInt();

        }

        System.out.println("Digite su sueldo");
        sueldo = entrada.nextDouble();
        while (sueldo < 0) {
            System.out.println("Sueldo no puede ser negativa");
            System.out.println("Digite su sueldo");
            sueldo = entrada.nextDouble();
        }

        if (turnonum == 1) {
            turno = "matutino";
        } else {
            turno = "vespertino";
        }

        System.out.println("Digite su propina");
        propina = entrada.nextInt();
        while (propina < 0) {
            System.out.println("Propina no puede ser negativa");
            System.out.println("Digite su propina");
            propina = entrada.nextInt();

        }
        aux.add(new meseros(nombre, edad, turno, sueldo, propina)) ;
        boolean validarmatutino= validarmatutinomeseros(aux);
        boolean validarvespertino= validarvespertinomeseros(aux);
        if (validarvespertino==false) {
            
            System.out.println("Ya hay 7 vespertino");
        }else if(validarmatutino==false){
        
            System.out.println("Ya hay 7 matutino");
        }
        
        if (validarvespertino==true&&validarmatutino==true) {
            aux.removeAll(aux);
            return new meseros(nombre, edad, turno, sueldo, propina);
            
        }else{
            aux.removeAll(aux);
        return new meseros("", 0,"" , 0, 0);
        }

        
    }

    public static void Modificarmeseros(ArrayList<meseros> meseros) {
        Scanner entrada = new Scanner(System.in);
        listarmeseros(meseros);
        System.out.println("Escoja una la posicion");
        int pos = entrada.nextInt();
        while (pos < 0 || pos > meseros.size() - 1) {
            System.out.println("Numero fuera de rango");
            System.out.println("Escoja una la posicion");
            pos = entrada.nextInt();
        }
        String nombre;
        int edad;
        String turno;
        double sueldo;
        double propina;
        System.out.println("\n\n\n");
        System.out.println("Digite el nombre del chef");
        nombre = entrada.nextLine();
        nombre = entrada.nextLine();
        System.out.println("Digite su edad");
        edad = entrada.nextInt();
        while (edad <= 0) {
            System.out.println("Edad no puede ser negativa");
            System.out.println("Digite su edad");
            edad = entrada.nextInt();
        }
        System.out.println("\nTurnos\n1-Matutino\n2-Vespertino");
        int turnonum = entrada.nextInt();
        while (turnonum < 1 || turnonum > 2) {
            System.out.println("Numero fuera de rango");
            System.out.println("\n\nTurnos\n1-Matutino\n2-Vespertino");
            turnonum = entrada.nextInt();

        }

        System.out.println("Digite su sueldo");
        sueldo = entrada.nextDouble();
        while (sueldo < 0) {
            System.out.println("Sueldo no puede ser negativa");
            System.out.println("Digite su sueldo");
            sueldo = entrada.nextDouble();
        }
        if (turnonum == 1) {
            turno = "matutino";
        } else {
            turno = "vespertino";
        }
        System.out.println("Digite su propina");
        propina = entrada.nextInt();
        while (propina < 0) {
            System.out.println("propina no puede ser negativa");
            System.out.println("Digite su propina");
            propina = entrada.nextInt();
        }

        meseros.get(pos).setEdad(edad);
        meseros.get(pos).setNombre(nombre);
        meseros.get(pos).setTurno(turno);
        meseros.get(pos).setSueldo(sueldo);
        meseros.get(pos).setPropina(propina);

    }

    public static int eliminarmeseros(ArrayList<meseros> meseros) {
        Scanner entrada = new Scanner(System.in);
        listarmeseros(meseros);
        System.out.println("Digite la posicion a eliminar");
        int pos = entrada.nextInt();
        while (pos < 0 || pos > meseros.size() - 1) {
            System.out.println("Numero fuera de rango");
            System.out.println("Escoja una la posicion");
            pos = entrada.nextInt();
        }

        return pos;
    }

    public static void listarmeseros(ArrayList<meseros> meseros) {
        for (int i = 0; i < meseros.size(); i++) {
            System.out.println("Posicion " + i + " " + meseros.get(i));
            System.out.println("");
            System.out.println("");
        }

    }

    public static bartenders crearBartender(ArrayList<bartenders> Bartender) {
        ArrayList<bartenders> aux= new ArrayList();
        aux.addAll(Bartender);
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String turno;
        double sueldo;
        int cantlicores;
        System.out.println("\n\n\n");
        System.out.println("Digite el nombre del Bartender");
        nombre = entrada.nextLine();
        System.out.println("Digite su edad");
        edad = entrada.nextInt();
        while (edad <= 0) {
            System.out.println("Edad no puede ser negativa");
            System.out.println("Digite su edad");
            edad = entrada.nextInt();
        }
        System.out.println("\nTurnos\n1-Matutino\n2-Vespertino");
        int turnonum = entrada.nextInt();
        while (turnonum < 1 || turnonum > 2) {
            System.out.println("Numero fuera de rango");
            System.out.println("\n\nTurnos\n1-Matutino\n2-Vespertino");
            turnonum = entrada.nextInt();

        }

        System.out.println("Digite su sueldo");
        sueldo = entrada.nextDouble();
        while (sueldo < 0) {
            System.out.println("Sueldo no puede ser negativa");
            System.out.println("Digite su sueldo");
            sueldo = entrada.nextDouble();
        }

        if (turnonum == 1) {
            turno = "matutino";
        } else {
            turno = "vespertino";
        }

        System.out.println("Digite cantidad de licores");
        cantlicores = entrada.nextInt();
        while (cantlicores < 0) {
            System.out.println("Licores no puede ser negativa");
            System.out.println("Digite cantidad de licores");
            cantlicores = entrada.nextInt();

        }
        aux.add(new bartenders(nombre, edad, turno, sueldo, cantlicores));
        boolean validarmatutino=validarmatutinobartender(aux);
        boolean validarvespertino=validarvespertinobartender(aux);
        if (validarvespertino==false) {
            System.out.println("Ya hay 7 vespertino");
        }else if(validarmatutino==false){
            System.out.println("Ya hay 7 maturino");
        
        }
        
        if (validarvespertino==false|| validarmatutino==false) {
            aux.removeAll(aux);
            return new bartenders("", 0, "", 0, 0);
        }else{
            aux.removeAll(aux);
        return new bartenders(nombre, edad, turno, sueldo, cantlicores);
        }
        
        

        
    }

    public static void Modificarbartenders(ArrayList<bartenders> bartenders) {
        Scanner entrada = new Scanner(System.in);
        listarbartender(bartenders);
        System.out.println("Escoja una la posicion");
        int pos = entrada.nextInt();
        while (pos < 0 || pos > bartenders.size() - 1) {
            System.out.println("Numero fuera de rango");
            System.out.println("Escoja una la posicion");
            pos = entrada.nextInt();
        }
        
        String nombre;
        int edad;
        String turno;
        double sueldo;
        int cantlicores;
        System.out.println("\n\n\n");
        System.out.println("Digite el nombre del Bartender");
        nombre = entrada.nextLine();
        System.out.println("Digite su edad");
        edad = entrada.nextInt();
        while (edad <= 0) {
            System.out.println("Edad no puede ser negativa");
            System.out.println("Digite su edad");
            edad = entrada.nextInt();
        }
        System.out.println("\nTurnos\n1-Matutino\n2-Vespertino");
        int turnonum = entrada.nextInt();
        while (turnonum < 1 || turnonum > 2) {
            System.out.println("Numero fuera de rango");
            System.out.println("\n\nTurnos\n1-Matutino\n2-Vespertino");
            turnonum = entrada.nextInt();

        }

        System.out.println("Digite su sueldo");
        sueldo = entrada.nextDouble();
        while (sueldo < 0) {
            System.out.println("Sueldo no puede ser negativa");
            System.out.println("Digite su sueldo");
            sueldo = entrada.nextDouble();
        }

        if (turnonum == 1) {
            turno = "matutino";
        } else {
            turno = "vespertino";
        }

        System.out.println("Digite cantidad de licores");
        cantlicores = entrada.nextInt();
        while (cantlicores < 0) {
            System.out.println("Licores no puede ser negativa");
            System.out.println("Digite cantidad de licores");
            cantlicores = entrada.nextInt();

        }
        bartenders.get(pos).setEdad(edad);
        bartenders.get(pos).setCantlicores(cantlicores);
        bartenders.get(pos).setNombre(nombre);
        bartenders.get(pos).setTurno(turno);
        bartenders.get(pos).setSueldo(sueldo);

    }

    public static int eliminarbartender(ArrayList<bartenders> Bartenders) {
        Scanner entrada = new Scanner(System.in);
        listarbartender(Bartenders);
        System.out.println("Digite la posicion a eliminar");
        int pos = entrada.nextInt();
        while (pos < 0 || pos > Bartenders.size() - 1) {
            System.out.println("Numero fuera de rango");
            System.out.println("Escoja una la posicion");
            pos = entrada.nextInt();
        }

        return pos;
    }

    public static void listarbartender(ArrayList<bartenders> bartenders) {
        for (int i = 0; i < bartenders.size(); i++) {
            System.out.println("Posicion " + i + " " + bartenders.get(i));
            System.out.println("");
            System.out.println("");
        }

    }
    public static mesas crearMesa() {
        Scanner entrada = new Scanner(System.in);
        int numplatos;
        int numutensilios;
        double preciototal;
        System.out.println("Digite los numeros de platos");
        numplatos=entrada.nextInt();
        while (numplatos<0) {            
            System.out.println("Los platos no pueden ser negativos");
            System.out.println("Digite los numeros de platos");
        numplatos=entrada.nextInt();
            
        }
        System.out.println("Digite el numero de utensilios");
        numutensilios=entrada.nextInt();
        while (numutensilios<0) {            
            System.out.println("Los utensilios no pueden ser negativos");
            System.out.println("Digite el numero de utensilios");
        numutensilios=entrada.nextInt();
            
        }
        System.out.println("Digite el precio total");
        preciototal=entrada.nextDouble();
        while (preciototal<0) {            
            System.out.println("El precio no puede ser negativo");
            System.out.println("Digite el precio total");
        preciototal=entrada.nextDouble();
            
        }
        

        return new mesas(numplatos, numutensilios, preciototal);
    }

    public static void Modificarmesa(ArrayList<mesas> mesas) {
        Scanner entrada = new Scanner(System.in);
        listarmesas(mesas);
        System.out.println("Digite la posicion a modificar");
        int pos=entrada.nextInt();
        while (pos<0||pos>mesas.size()-1) {            
            System.out.println("Numero fuera de rango");
            System.out.println("Digite la posicion a modificar");
            pos=entrada.nextInt();
        }
        int numplatos;
        int numutensilios;
        double preciototal;
        System.out.println("Digite los numeros de platos");
        numplatos=entrada.nextInt();
        while (numplatos<0) {            
            System.out.println("Los platos no pueden ser negativos");
            System.out.println("Digite los numeros de platos");
        numplatos=entrada.nextInt();
            
        }
        System.out.println("Digite el numero de utensilios");
        numutensilios=entrada.nextInt();
        while (numutensilios<0) {            
            System.out.println("Los utensilios no pueden ser negativos");
            System.out.println("Digite el numero de utensilios");
        numutensilios=entrada.nextInt();
            
        }
        System.out.println("Digite el precio total");
        preciototal=entrada.nextDouble();
        while (preciototal<0) {            
            System.out.println("El precio no puede ser negativo");
            System.out.println("Digite el precio total");
        preciototal=entrada.nextDouble();
            
        }
        mesas.get(pos).setNumplatos(numplatos);
        mesas.get(pos).setNumutensilios(numutensilios);
        mesas.get(pos).setPreciototal(preciototal);
        

    }

    public static int eliminarmesas(ArrayList<mesas> mesas) {
        Scanner entrada = new Scanner(System.in);
        listarmesas(mesas);
        System.out.println("Digite la posicion a eliminar");
        int pos = entrada.nextInt();
        while (pos < 0 || pos > mesas.size() - 1) {
            System.out.println("Numero fuera de rango");
            System.out.println("Escoja una la posicion");
            pos = entrada.nextInt();
        }

        return pos;
    }

    public static void listarmesas(ArrayList<mesas> mesas) {
        for (int i = 0; i < mesas.size(); i++) {
            System.out.println("Posicion " + i + " " + mesas.get(i));
            System.out.println("");
            System.out.println("");
        }

    }
    public static void sumaprecio(ArrayList<mesas>mesas){
        double suma=0;
        for (int i = 0; i < mesas.size(); i++) {
            suma+=mesas.get(i).getPreciototal();
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Precio total "+suma);
    
    
    }
    public static boolean validarmatutinochefs(ArrayList<Chefs> chefs){
    int contmatutino=0;
        for (int i = 0; i < chefs.size(); i++) {
            if (chefs.get(i).getTurno().equalsIgnoreCase("matutino")) {
                contmatutino+=1;
            }
    
        }
        System.out.println("Cont matutino "+contmatutino);
        if (contmatutino<=7) {
            return true;
        }else{
        return false;
        }
    
    }
    public static boolean validarvespertinochef(ArrayList<Chefs> chefs){
    int contvespertino=0;
        for (int i = 0; i < chefs.size(); i++) {
            if (chefs.get(i).getTurno().equalsIgnoreCase("vespertino")) {
                contvespertino++;
            }
    
        }
        if (contvespertino<=7) {
            return true;
        }else{
        return false;
        }
    
    }
    public static boolean validarmatutinomeseros(ArrayList<meseros> Meseros){
    int contmatutino=0;
        for (int i = 0; i < Meseros.size(); i++) {
            if (Meseros.get(i).getTurno().equalsIgnoreCase("matutino")) {
                contmatutino++;
            }
    
        }
        if (contmatutino<=6) {
            return true;
        }else{
        return false;
        }
    
    }
    public static boolean validarvespertinomeseros(ArrayList<meseros> Meseros){
    int contvespertino=0;
        for (int i = 0; i < Meseros.size(); i++) {
            if (Meseros.get(i).getTurno().equalsIgnoreCase("vespertino")) {
                contvespertino++;
            }
    
        }
        if (contvespertino<=6) {
            return true;
        }else{
        return false;
        }
    
    }
    public static boolean validarmatutinobartender(ArrayList<bartenders> Bartenders){
    int contmatutino=0;
        for (int i = 0; i < Bartenders.size(); i++) {
            if (Bartenders.get(i).getTurno().equalsIgnoreCase("matutino")) {
                contmatutino++;
            }
    
        }
        if (contmatutino<=6) {
            return true;
        }else{
        return false;
        }
    
    }
    public static boolean validarvespertinobartender(ArrayList<bartenders> Bartenders){
    int contvespertino=0;
        for (int i = 0; i < Bartenders.size(); i++) {
            if (Bartenders.get(i).getTurno().equalsIgnoreCase("vespertino")) {
                contvespertino++;
            }
    
        }
        if (contvespertino<=6) {
            return true;
        }else{
        return false;
        }
    
    }
}
