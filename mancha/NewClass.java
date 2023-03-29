/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema9.mancha;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alvarogasca
 */
public class NewClass {
    public static void main(String[] args) {
     BufferedWriter out = null;
    try {
        out = new BufferedWriter(new FileWriter("quijote.txt"));
        
        out.write("En un lugar de La Mancha,");
        out.newLine();
        out.write("de cuyo nombre no quiero acordarme");
        out.flush();
        out.close();
    } catch (IOException ex) {
        
    System.out.println(ex.getMessage());
    }
    }
}
