/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema9.mancha;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author alvarogasca
 */
public class Fin {
    public static void main(String[] args) {
         try {
            BufferedWriter out = new BufferedWriter(new FileWriter("texto.txt"));
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input;

            do {
                System.out.print("Enter text: ");
                input = reader.readLine();

                if (!"fin".equals(input)) {
                    out.write(input);
                    out.newLine();
                }
            } while (!"fin".equals(input));

            out.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
