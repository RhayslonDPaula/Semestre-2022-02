/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe2cap5;


import java.util.Random;

/**
 *
 * @author rhays
 */
public class Ola {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Ola ola1 = new Ola();
        
        ola1.cumprimenta();
        
    }
    
    public void cumprimenta(){
        Random gerador = new Random();
        
        switch (gerador.nextInt(3)) {
            case 2:
                System.out.println("Bonjour");
                break;
            case 1:
                System.out.println("Kon'nichiwa");
                break;
            default:
                System.out.println("Ola");
                break;
        }
            
        
    }
    
}
