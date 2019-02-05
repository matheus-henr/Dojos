#include <stdio.h>

int main(){
    int codPeca1, codPeca2, totPeca1, totPeca2;
    float valorPeca1, valorPeca2, total;
    scanf("%d %d %f", &codPeca1, &totPeca1, &valorPeca1);
    scanf("%d %d %f", &codPeca2, &totPeca2, &valorPeca2);
    total = (totPeca1 * valorPeca1) + (totPeca2 * valorPeca2);
    printf("VALOR A PAGAR: R$ %.2f\n",total );
}