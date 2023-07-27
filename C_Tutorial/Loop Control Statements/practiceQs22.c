#include<stdio.h>

int main(){
    int n ;
    printf("Enter Number : ");
    scanf("%d", &n);

    for(int i =10; i >= 1; i--){
        printf("%d \n " , n* i);
    }
    return 0;
}

/*
Enter Number : 4
40 
 36
 32
 28
 24
 20
 16
 12
 8
 4
*/