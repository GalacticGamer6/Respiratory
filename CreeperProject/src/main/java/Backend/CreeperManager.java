/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Neeraavr
 */
public class CreeperManager {

    private static final String PATH = "data\\creeper.txt";

    public static void setCreeper(String colour, String biome, int HP, double blastRadius) {

        Creeper c = new Creeper(colour, biome, HP, blastRadius);

        try {

            FileWriter fw = new FileWriter(PATH, false);
            PrintWriter pw = new PrintWriter(fw);

            pw.println(c.toFileString());

            pw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(CreeperManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CreeperManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static String getCreeper() {

        Scanner sc = new Scanner(PATH);
        //Scanner sc = new Scanner(new File(PATH))
        String colour = sc.next();
        String biome = sc.next();
        int HP = sc.nextInt();
        double blastRadius = sc.nextDouble();

        Creeper c = new Creeper(colour, biome, HP, blastRadius);
        return c.toString();

    }
}
