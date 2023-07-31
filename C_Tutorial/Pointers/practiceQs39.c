#include<stdio.h>

//void printAddress(int n); // call by value
void printAddress(int *n); // call by value

int main(){
    int n = 4 ;
    // printAddress(n);
    printAddress(&n);
    printf("address of n is : %u \n", n);
	return 0;
}

void printAddress(int *n){
        printf("address of N is : %u \n",*n);
}
