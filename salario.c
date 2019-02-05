#include <stdio.h>

int main(){
    int numFun, horas;
    float valor, salario;
    scanf("%d %d %f", &numFun,&horas, &valor);
    salario = valor * horas;
    printf("NUMBER = %d\n", numFun);
    printf("SALARY = U$ %.2f\n", salario);
    return 0;
}