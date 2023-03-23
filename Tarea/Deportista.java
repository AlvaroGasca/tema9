/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema9.Tarea;

import java.util.Scanner;

/**
 *
 * @author alvarogasca
 */
public class Deportista {
    String nombre;
    int edad;
    double estatura;
    
    Deportista(){}

    public Deportista(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        String[] datos = input.split(" ");
        String nombre = datos[0];
        int edad = Integer.parseInt(datos[1]);
        double estatura = Double.parseDouble(datos[2]);

        Deportista deportista = new Deportista(nombre, edad, estatura);
        System.out.println("Nombre: " + deportista.getNombre());
        System.out.println("Edad: " + deportista.getEdad());
        System.out.println("Estatura: " + deportista.getEstatura());
    }
}

