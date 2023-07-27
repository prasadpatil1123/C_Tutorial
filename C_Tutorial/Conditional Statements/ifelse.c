#include<stdio.h>

int main(){
    int age;
    printf("enter age : ");
    scanf("%d",&age);

    if( age > 18 ){
        printf("You are Adult \n");
        printf("You can Drive \n");
        printf("Also, You will Vote \n");
    }else{
        printf("You are not adult \n");
    }

    printf("Thank you \n");
    return 0;
}