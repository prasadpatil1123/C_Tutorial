#include<stdio.h>

int main(){
    int n;
    printf("Enter Number : ");
    scanf("%d", &n);

    for(int i =1 ; i <= 10 ; i++){
        printf("%d \n", n*i);
    }
    return 0;
}

/*
Enter Number : 3
3 
6
9
12
15
18
21
24
27
30

*/