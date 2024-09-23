/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fajlbeolvasfeladat;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author lajko.gergo
 */
public class FajlBeolvasFeladat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      InputStream is = FajlBeolvasFeladat.class.getClassLoader().getResourceAsStream("res\emberek.csv");
      BufferedReader br = new BufferedReader(new InputStreamReader(is));
      String sor;
        System.out.println("beolvasott fájl tartalma: ");
        while (sor = br.readLine()) !=null) {            
            System.out.println(sor);
        }
        System.out.println("Ki lakik BP-en: ");
    }
    
}
