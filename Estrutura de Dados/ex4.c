#include <stdio.h>

typedef struct {
  int dia;
  int mes;
  int ano;
}Data;

Data *createTime(int d, int m, int a); 
Data *readTime(); 
void showTime(Data *dat);


typedef struct {
  int numero;
  float saldo;
}Conta;

Conta *criar (int n,float s);
Conta *abrirconta ();
void apresenta(Conta *cont);
void deposito(Conta *cont, float valor);
void saque(Conta *cont, float valor);

int main(void) {
  Conta *r;
  r=abrirconta ();
  deposito(r,345);
  saque(r, 340);
  return 0;
}

Data *createTime(int d, int m, int a) {
Data *dat = (Data *) malloc(sizeof(Data));
dat->dia = d;
dat->mes = m;
dat->ano = a;
return dat;
}
Data *readTime() {
int d, m, a;
printf("Informe o dia: ");
scanf("%d", &d);
printf("Informe o mes: ");
scanf("%d", &m);
printf("Informe o ano: ");
scanf("%d", &a);
return createTime(d, m, a);
}
void showTime(Data *t) {
printf("%dh %dm %ds\n", t->dia, t->mes, t->ano);
}

Conta *criar (int n,float s){
  Conta *con = (Conta *) malloc(sizeof(Conta));
  con ->numero = n;
  con ->saldo = s ;
  return con;
}
Conta *abrirconta (){
  int n;
  float s = 0;
printf("Informe o numero da conta: ");
scanf("%d", &n);
  return criar (n,s);

}
void apresenta(Conta *con){
  printf("\nConta :%d\nSaldo :%f\n",con->numero,con->saldo);
}
void deposito(Conta *cont, float valor){
  cont->saldo+=valor;
  apresenta(cont);
}
void saque(Conta *co, float valor){
  co->saldo-=valor;
  apresenta(co);
}