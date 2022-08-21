package exe3cap5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rhays
 */
public class Inteiro {
    //– Atributos:
int valor = 0;

public int getValor(){
       return valor;
    }
public void setValor(int valor){
       this.valor = valor;
    }
    /**
     *
     * @param args
     * @param 
     */

//Valor do inteiro representado.
//– Métodos para interação com o usuário da classe:
public void carregaValor(int v){
    Inteiro inte = new Inteiro();
    inte.setValor(v);
}
//Muda o valor representado por este objeto. O novo valor deve ser v.
public int devolveValor(){
    Inteiro inte = new Inteiro();
    int i = inte.getValor();
    return i;
}
//Devolve o valor representado por este objeto.
public int devolveValorAbsoluto(){
    Inteiro inte = new Inteiro();
    int i = inte.getValor();
    return i;
}
//Devolve o valor absoluto do valor representado por este objeto.
public void imprime(){
     Inteiro inte = new Inteiro();
    System.out.println(inte.getValor());
}
//Imprime algo que representa este objeto. Sugestão: imprima o seu valor.
public int soma(int v){
     Inteiro inte = new Inteiro();
    return inte.getValor()+v;
}
//Soma v ao valor deste objeto (valor + v). Este objeto passa a representar o novo
//valor, que também deve ser devolvido pelo método.
public int subtrai(int v){
     Inteiro inte = new Inteiro();
    return inte.getValor()-v;
}
//Subtrai v do valor deste objeto (valor - v). Este objeto passa a representar o novo
//valor, que também deve ser devolvido pelo método.
public int multiplicaPor(int v){
     Inteiro inte = new Inteiro();
    
    return inte.getValor()*v;
}
//Multiplica o valor deste objeto por v (valor * v). Este objeto passa a representar o
//novo valor, que também deve ser devolvido pelo método.
public int dividePor(int divisor){
     Inteiro inte = new Inteiro();
     if(divisor == 0){
         System.out.println("erro");
     }else {
         divisor = inte.getValor()/divisor;
     }
    return divisor;
}
/*Verifica se divisor é diferente de zero. Se não, imprime uma mensagem de erro e
não faz nada (devolve o valor inalterado). Se for, divide o valor deste objeto por
v (valor / divisor, divisão inteira). Este objeto passa a representar o novo valor,
que também deve ser devolvido pelo método.*/
}
