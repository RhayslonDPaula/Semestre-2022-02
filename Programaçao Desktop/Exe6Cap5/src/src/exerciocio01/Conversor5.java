/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciocio01;

/**
 *
 * @author rhays
 */
public class Conversor5 {

    public float Celsius2Fahrenheit(float celsius) {
        return (float) ((celsius*1.8)+32);
    }

    public float Celsius2Kelvin(float celsius) {
        return (celsius+273);
    }

    public float Fahrenheit2Celsius(float fahrenheit) {
        return (float)((fahrenheit-32)/1.8);
    }

    public float Fahrenheit2Kelvin(float fahrenheit) {
        return (float)((fahrenheit-32)*5/9+273);
    }

    public float Kelvin2Celsius(float kelvin) {
        return (kelvin-273);
    }

    public float Kelvin2Fahrenheit(float kelvin) {
        return (float)((kelvin-273)*(1.8)+32);
    }
}
