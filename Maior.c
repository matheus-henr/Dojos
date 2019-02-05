#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(){

    int maior, A,B,C,D;
    scanf("%d %d %d",&A, &B, &C);
    D = (A+B + abs(A - B))/2;
    maior = (D+C + abs(D - C))/2;
    printf("%d eh o maior\n", maior);
    return 0;
}
