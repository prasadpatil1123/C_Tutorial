#include<stdio.h>

float squareArea(float side);
float circleArea(float rad);
float rectangleArea(float a, float b);

int main(){

    float a = 6.0;
    float b = 9.0;

    float s = 10;

    float r = 7;

    printf("Area of Square : %f \n", squareArea(s));
      printf("Area of Circle : %f \n",circleArea(r));
        printf("Area of Rectangle : %f \n", rectangleArea(a,b));
	return 0;
}

float squareArea(float s){
    return s * s;
}

float circleArea(float r){
    return 3.14 * r * r;
}

float rectangleArea(float a, float b){
    return a*b;
}