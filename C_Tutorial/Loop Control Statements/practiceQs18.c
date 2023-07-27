#include<stdio.h>

int main(){
    int n;

    do{
        printf("Enter Number : ");
        scanf("%d", &n);
        printf("%d \n", n);

        if(n % 7 == 0){
            break;
        }
    }while(1);

    printf("Thank you");
    return 0;
}

/*
Enter Number : 6
6 
Enter Number : 8
8 
Enter Number : 9
9 
Enter Number : 12
12 
Enter Number : 15
15 
Enter Number : 14
14 
Thank you
*/