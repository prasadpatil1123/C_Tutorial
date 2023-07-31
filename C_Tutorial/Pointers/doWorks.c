#include<stdio.h>

void doWorks(int a, int b, int *sum, int *prod, int *avg);

int main(){
    int a =3, b = 5;
    int sum, prod, avg;
    doWorks(a,b,&sum,&prod,&avg);
    printf(" sum = %d, Prod = %d, Avg = %d \n", sum, prod, avg ); // sum = 8, Prod = 15, Avg = 4 
	return 0;
}

void doWorks(int a, int b, int *sum, int *prod, int *avg){
    *sum = a+b;
    *prod = a * b;
    *avg = (a+b)/2;
}
