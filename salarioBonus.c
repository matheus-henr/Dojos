#include <stdio.h>

int main(){
    char nome[20];
    float salario, totVendas, salarioBonus;
    scanf("%s %f %f",&nome, &salario, &totVendas);
    salarioBonus = salario + ((totVendas * 15) / 100);
    printf("TOTAL = R$ %.2f\n",salarioBonus);
}