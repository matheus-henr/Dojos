#include <stdio.h>
#include <math.h>
#define PI 3.14159
int main(){
   const float R;
   double volume;
    scanf("%f",&R);
    volume = (4.0/3) * PI * pow(R,3);
    printf("VOLUME = %0.3f\n", volume);
}
