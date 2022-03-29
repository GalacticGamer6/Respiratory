/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author Neeraavr
 */
public class Creeper {
    
    public String colour; 
    public String biome; 
    public int HP; 
    public double blastRadius; 
    
    public Creeper (String inputColour, String inputBiome, int inputHP, double inputBlastRadius){
        colour = "Green"; 
        biome = "Cave"; 
        HP = 100; 
        blastRadius = 10.5; 
    }
    
    public String toString(){
        return "Creeper{colour: " + colour + ", biome: " + biome + ", HP: " + HP + ", Blast Radius: " + blastRadius; 
    }
    
    public String toFileString(){
        return colour + "#" + biome +"#"+ HP + "#" + blastRadius;
    }
}
