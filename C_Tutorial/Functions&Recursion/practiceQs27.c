#include<stdio.h>

//declaration/prototype
void printHello(); 
void printGoodBye(); 

int main(){
    printHello(); // Function Call
    printGoodBye(); 
}

//Function definition
void printHello(){
    printf("Hello ! \n");
}

void printGoodBye(){
    printf("Good Bye ! \n");
}