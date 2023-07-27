#include<stdio.h>
int main(){

    int age;
    printf("Enter your age: ");
    scanf("%d", &age);

    (age >= 18) ? printf("You can vote !!") : printf("you cannot vote!!");
}

/*
OTUPUT:
Enter your age: 10
you cannot vote!!

Enter your age: 19
You can vote !!
*/