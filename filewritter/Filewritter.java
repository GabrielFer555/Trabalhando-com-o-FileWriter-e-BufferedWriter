/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filewritter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Pichau
 */
public class Filewritter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path = "C:\\Users\\Pichau\\Desktop\\seaShanties.txt";
        String [] list = new String[]{"Here´s a Health to the Company", "Leave Her Johnny", "Captain Kid"};
        String [] Songs = new String[]{"Barrets Privateers", "On the railroad", "Wellerman"};
        try(BufferedWriter bw = new BufferedWriter (new FileWriter(path, true)) ){
            bw.newLine();
            for(String line: Songs){
                bw.write(line);
                bw.newLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
