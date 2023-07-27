#include<stdio.h>

int main(){
    int n;
    printf("enter number : ");
    scanf("%d", &n);

    int sum = 0;

    // for(int i=1; i <= n; i++){
    //     sum = sum + i;
    // }

    for(int j =n; j >= 1; j--){
        sum = sum + j;
        printf("%d \n", j);
    }

    printf("sum is %d", sum);

    return 0;
}

/*
enter number : 8
8 
7
6
5
4
3
2
1
sum is 36
*/