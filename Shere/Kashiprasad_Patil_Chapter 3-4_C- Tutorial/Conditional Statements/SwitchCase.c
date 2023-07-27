#include<stdio.h>
int main(){

    char ch;
    printf("Enter a character for week day: ");
    scanf("%c", &ch);

    switch(ch){
        case 'm':
            printf("Monday!!");
            break;

         case 't':
            printf("Tuesday!!");
            break;

        case 'w':
            printf("Wednesday!!");
            break;

        case 'T':
            printf("Thursday!!");
            break;

        case 'f':
            printf("Friday!!");
            break;

        case 's':
            printf("Saturday!!");
            break;

       case 'S':
            printf("Sunday!!");
            break;
        
        default:
            printf("Invalid entry!!");
    }
}

/*
OUTPUT:

Enter a character for week day: m
Monday!!

Enter a character for week day: t
Tuesday!!

Enter a character for week day: T
Thursday!!

Enter a character for week day: S
Sunday!!

Enter a character for week day: s
Satday!!


*/