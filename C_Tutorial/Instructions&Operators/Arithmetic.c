#include<stdio.h>
int main(){
    int x = 1 , y = 2 , z = 3;

    x = y + z ; 

    printf("%d \n" , y * z ); // 6
    printf("%d \n" , x * z ); // 15
    return 0;
}