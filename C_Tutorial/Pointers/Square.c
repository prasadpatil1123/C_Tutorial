#include<stdio.h>
void square(int n);
void _square(int* n);

int main(){

    int number = 4;
    square(number);
    printf("number = %d \n", number);// number = 4 

    _square(&number);
    printf("number = %d \n", number);// number = 4 
	return 0;
}

// call by value
void square(int n){
    n = n * n;
    printf("Square = %d \n",n); // Square = 16 
}

void _square(int* n){
    *n = (*n) * (*n);
    printf("Square = %d \n",*n); // Square = 16 
}