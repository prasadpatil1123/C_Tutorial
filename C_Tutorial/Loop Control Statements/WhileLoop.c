#include<stdio.h>
int main(){
    int n;
    printf("Enter number till will give you even number: ");
    scanf("%d", &n);

    int i=1;
    while(i<=n){
        if(i%2==0){
            printf("Even number: %d\n",i);
        }
        i++;
    }
}

/*
OUTPUT:
Enter number till will give you even number: 20
Even number: 2
Even number: 4
Even number: 6
Even number: 8
Even number: 10
Even number: 12
Even number: 14
Even number: 16
Even number: 18
Even number: 20
*/