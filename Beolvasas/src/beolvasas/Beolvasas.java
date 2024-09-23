/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beolvasas;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class Beolvasas {

    public static void main(String[] args) throws IOException {
        List<String> abszolut = Files.readAllLines(Path.of("c:\\iso\\txt.txt"));
        System.out.println("aboszolut"+abszolut);
         List<String> relativ = Files.readAllLines(Path.of("relativ.txt"));
        System.out.println("aboszolut"+abszolut);
        FileKezeles.class.getClassLoader().getResourceAsStream("res/res.txt");
        BufferedReader bf = new BufferedReader(new InputStreamReader(is));
        String sor ;
        while((sor = bf.readLine())!= null){
        System.out.println("res = "+sor);
        }
        sor = bf.readLine();
    }
    
}
