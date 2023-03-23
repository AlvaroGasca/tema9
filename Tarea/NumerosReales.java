/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema9.Tarea;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author alvarogasca
 */
public class NumerosReales {
    public static void main(String[] args) {
        double suma = 0;
        try {
            File archivo = new File("Numeros.txt");
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                double numero = Double.parseDouble(linea);
                suma += numero;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        } catch (NumberFormatException e) {
            System.out.println("El archivo no contiene números reales válidos");
        }
        System.out.println("La suma de los números es: " + suma);
    }
}
