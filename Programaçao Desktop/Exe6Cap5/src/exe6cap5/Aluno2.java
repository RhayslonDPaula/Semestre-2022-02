/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe6cap5;

import java.util.Scanner;

/**
 *
 * @author rhays
 */
public class Aluno2 {

    double p1 = 0, p2 = 0, p3 = 0, p4 = 0;

    public double getp1() {
        return p1;
    }

    public double getp2() {
        return p2;
    }

    public double getp3() {
        return p3;
    }

    public double getp4() {
        return p4;
    }

    public void setp1(double p1) {
        this.p1 = p1;
    }

    public void setp2(double p2) {
        this.p2 = p2;
    }

    public void setp3(double p3) {
        this.p3 = p3;
    }

    public void setp4(double p4) {
        this.p4 = p4;
    }

    public void recebeNota1() {
        Scanner leitor = new Scanner(System.in);
        Aluno2 a = new Aluno2();
        System.out.println(" \n Digite a Primeira nota :");
        double i = leitor.nextFloat();
        a.setp1(i);
    }

    public void recebeNota2() {
        Scanner leitor = new Scanner(System.in);
        Aluno2 a = new Aluno2();
        System.out.println(" \n Digite a Segunda nota :");
        double i = leitor.nextFloat();
        a.setp2(i);
    }

    public void recebeNota3() {
        Scanner leitor = new Scanner(System.in);
        Aluno2 a = new Aluno2();
        System.out.println(" \n Digite a Terceira nota :");
        double i = leitor.nextFloat();
        a.setp3(i);
    }

    public void recebeNota4() {
        Scanner leitor = new Scanner(System.in);
        Aluno2 a = new Aluno2();
        System.out.println(" \n Digite a Quarta nota :");
        double i = leitor.nextFloat();
        a.setp4(i);
    }

    public void imprimeMédia() {
        Aluno2 a = new Aluno2();
        a.recebeNota1();
        a.recebeNota2();
        a.recebeNota3();
        a.recebeNota4();
        
        System.out.println (" A media total é  :"+(a.getp1() + a.getp2() + a.getp3() + a.getp4())/4);
    }
    }
