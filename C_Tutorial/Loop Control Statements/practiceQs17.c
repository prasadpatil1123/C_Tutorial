#include<stdio.h>

int main(){
    int n;

    do{
        printf("Enter Number : ");
        scanf("%d", &n);
        printf("%d \n", n);

        if(n % 2 != 0){
            break;
        }
    }while(1);

    printf("Thank you");
    return 0;
}

/*
Enter Number : 2
2 
Enter Number : 4
4 
Enter Number : 6
6 
Enter Number : 8
8 
Enter Number : 10
10 
Enter Number : 5
5 
Thank you
*/