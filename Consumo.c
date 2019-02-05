#include <stdio.h>
#include <stdlib.h>

int main(){
    int X;
    double Y, result;
    scanf("%d %lf", &X, &Y);
    result = X/Y;
    printf("%.3lf km/l\n", result);
}
