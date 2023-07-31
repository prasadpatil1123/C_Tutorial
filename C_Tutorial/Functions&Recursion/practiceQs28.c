#include<stdio.h>

//declaration/prototype
void namaste(); 
void bonjour(); 

int main(){
        printf(" Enter F for french & i for India: \n");
        char ch;
        scanf("%c", &ch);

        if(ch == 'i'){
            namaste();
        }else{
            bonjour();
        }
        return 0;
}
void namaste(){
    printf(" Namaste ! \n");
}

void bonjour(){
    printf(" Bonjour ! \n");
}