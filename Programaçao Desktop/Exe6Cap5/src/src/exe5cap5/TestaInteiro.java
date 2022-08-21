/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe5cap5;

import exe3cap5.Inteiro;

/**
 *
 * @author rhays
 */
public class TestaInteiro {
    
    public static void main (String[] args) {
    Inteiro i = new Inteiro();
    i.carregaValor(14);
    i.devolveValor();
    i.carregaValor(-473158);
    i.devolveValor();
    i.devolveValorAbsoluto();
    i.imprime();
    i.carregaValor(15);
    i.subtrai(20);
    i.devolveValor();
    
}
}
