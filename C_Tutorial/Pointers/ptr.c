#include<stdio.h>

int main(){

    int i = 4;
    int *ptr = &i;
    int **pptr = &ptr;

    printf("%d \n", **pptr);
	return 0;
}