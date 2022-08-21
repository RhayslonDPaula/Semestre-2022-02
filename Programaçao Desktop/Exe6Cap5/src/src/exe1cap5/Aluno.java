/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe1cap5;

/**
 *
 * @author rhays
 */
public class Aluno {
    
    double p1 =0,p2 =0,p3 =0,p4 =0,media = 0;
    
    public double getmedia(){
       return media;
    }
    public double getp1(){
       return p1;
    }
    public double getp2(){
       return p2;
    }
    public double getp3(){
       return p3;
    }
    public double getp4(){
       return p4;
    }
    public void setp1(double p1){
       this.p1 = p1;
    }
    public void setp2(double p2){
       this.p2 = p2;
    }
     public void setp3(double p3){
       this.p3 = p3;
    }
     public void setp4(double p4){
       this.p4 = p4;
    }
     public void setmedia(double media){
       this.media = media;
    }
    public void veredito(){
        setmedia((p1+p2+p3+p4)/4);
        if (getmedia()> 6){
           System.out.println("Media: "+getmedia()+" -> aprovado."); 
        }else if (getmedia()< 6 && getmedia()> 3){
           System.out.println("Media: "+getmedia()+" -> recuperação."); 
        }else {
           System.out.println("Media: "+getmedia()+" -> reprovado."); 
        }
    }
    public void setnotas(double n1,double n2,double n3 ,double n4){
        setp1(n1);
        setp2(n2);
        setp3(n3);
        setp4(n4);
    }
    public static void main(String [] args){ 
        Aluno aluno1 = new Aluno();
        aluno1.setnotas(8.7,7.2,9.3,7.4);
        aluno1.veredito();
        aluno1.setnotas(5.2, 3.4, 6.5, 2.1);
        aluno1.veredito();
        aluno1.setnotas(3.4, 5.1, 1.1, 2.0);
        aluno1.veredito();
    }
  
}
