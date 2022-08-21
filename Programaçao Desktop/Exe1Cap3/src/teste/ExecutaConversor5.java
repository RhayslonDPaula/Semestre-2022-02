/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import exerciocio01.Conversor5;
import java.util.Scanner;

/**
 *
 * @author rhays
 */
public class ExecutaConversor5 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Conversor5 converte = new Conversor5();

        System.out.println("Digite a temperatura " + args[0] + " para " + args[1] + " Conversão ");

        Float temp = leitor.nextFloat();

        if (args[0].equalsIgnoreCase("celsius")
                && args[1].equalsIgnoreCase("fahrenheit")) {
            float Fahrenheit = converte.Celsius2Fahrenheit(temp);
            System.out.println("O equivalente a Fahrenheit é : " + "" + Fahrenheit);
        } else if (args[0].equalsIgnoreCase("celsius")
                && args[1].equalsIgnoreCase("kelvin")) {
            float kelvin = converte.Celsius2Kelvin(temp);
            System.out.println("O equivalente a kelvin é : " + "" + kelvin);
        } else if (args[0].equalsIgnoreCase("fahrenheit")
                && args[1].equalsIgnoreCase("celsius")) {
            float celsius = converte.Fahrenheit2Celsius(temp);
            System.out.println("O equivalente a celsius é : " + "" + celsius);
        } else if (args[0].equalsIgnoreCase("fahrenheit")
                && args[1].equalsIgnoreCase("kelvin")) {
            float kelvin = converte.Fahrenheit2Kelvin(temp);
            System.out.println("O equivalente a kelvin é : " + "" + kelvin);
        } else if (args[0].equalsIgnoreCase("kelvin")
                && args[1].equalsIgnoreCase("celsius")) {
            float celsius = converte.Kelvin2Celsius(temp);
            System.out.println("O equivalente a celsius é : " + "" + celsius);
        } else if (args[0].equalsIgnoreCase("kelvin")
                && args[1].equalsIgnoreCase("fahrenheit")) {
            float fahrenheit = converte.Kelvin2Fahrenheit(temp);
            System.out.println("O equivalente a fahrenheit é : " + "" + fahrenheit);
        }

    }
}
