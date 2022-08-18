/* 
1) Escreva uma função que receba o valor das avaliações 1, 2, 3 e 4 realizadas por um aluno e
retorne o conceito final obtido. Considere que as provas possuem pesos 2, 3, 4 e 5,
respectivamente.
 Se a nota final é maior ou igual a 8.5 o aluno obteve um conceito ‘A’.
 Se a nota final é entre 7.0 e 8.5 o aluno obteve um conceito ‘B’.
 Caso contrário, se a nota final foi maior ou igual do que 6.0 o conceito é um ‘C’
e se foi reprovado o conceito é um ‘D’.
 A função deve ter o seguinte cabeçalho:
o char notaFinal(float n1, float n2, float n3, float n4);

2) Escreva uma função que receba como parâmetro um vetor contendo as 5 principais
despesas de uma família e exiba na tela a porcentagem de cada um dos gastos, considerando
que o total dos gastos é a soma de todos eles. A função deve ter o seguinte cabeçalho:
 void percentualGastos(float[] despesas);

3) Escreva uma função para determinar se um número é primo ou não.
 Se o número for primo, a função deve retornar o valor numérico “1”;
 Se o número não for primo, a função deve retornar o valor numérico “0”;
 A função deve ter o seguinte cabeçalho:
 int primo(int x);

4) Faça um programa que receba do usuário dois vetores, A e B, com 10 números inteiros cada.
Crie um novo vetor denominado C calculando C = A- B. Mostre na tela os dados do vetor C.

5) Implemente uma função recursiva que, dados dois números inteiros “x” e “n”, calcula o valor
de “x” elevado a “n”. Considere neste exercício que o expoente (n) será um valor positivo
ou igual a zero.

6) Faça um programa que solicite ao usuário para informar 5 valores inteiros e positivos:
 Crie um vetor A para armazenar os dados informados pelo usuário;
 Calcule o fatorial para cada um dos elementos do vetor A e armazene os resultados
obtidos em um vetor B de mesma dimensão de A;
 Mostre na tela os dados dos vetores A e B.
*/
#include <stdio.h>

void ex1(void);
void ex2(void);
void ex3(void);
void ex4(void);
void ex5(void);
void ex6(void);

void percentualGastos(float despesas [] );
char notaFinal(float n1, float n2, float n3, float n4);

int main(void) { 
  //ex1();
  ex2();
 
  }

void ex1(void) {
  float n1, n2, n3, n4;

  for (int i = 1; i <= 4; i++) {
    printf("\nDigite o valor da avaliaçao %d = ", i);

    switch (i) {
    case 1:
      scanf("%f", &n1);
      break;

    case 2:
      scanf("%f", &n2);
      break;

    case 3:
      scanf("%f", &n3);
      break;

    case 4:
      scanf("%f", &n4);
      break;
    }
  }
  notaFinal(n1, n2, n3, n4);
}
char notaFinal(float n1, float n2, float n3, float n4) {

  double f;

  f = (((n1 * 2) + (n1 * 3) + (n1 * 4) + (n1 * 5)) / 14);

  if (f >= 8.5) {
    printf("\nO aluno obteve um conceito A");
  } else if (f >= 7.0 && f < 8.5) {
    printf("\nO aluno obteve um conceito B");
  } else if (f >= 6.0) {
    printf("\nO aluno obteve um conceito c");
  } else if (f < 6.0) {
    printf("\nO aluno obteve um conceito D");
  }

  return 0;
}
void ex2 (){
  float a[5];
  for (int i = 0 ; i<5 ; i++){
    printf("\nDespesa %d = ",i+1);
    scanf("%f",&a[i]);
    
  }
  percentualGastos(a);
}
void percentualGastos(float despesas [] ){
  float soma,p[5];
  for (int i = 0 ; i<5 ; i++){
    soma += despesas [i];
    
  }
  for (int i = 0 ; i<5 ; i++){
    p [i] = soma + despesas [i];
  }
  for (int i = 0 ; i<5 ; i++){
    
    printf("\nDespesa %d =  %f",i+1,p[i]);
    
  }
}

