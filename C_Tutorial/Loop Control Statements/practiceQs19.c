#include<stdio.h>

int main(){
   
   for(int i = 1; i <= 10; i++){
    if(i == 6){
        continue;
    }
    printf("%d \n",i);
   }
    return 0;
}

/*
1 
2 
3 
4 
5 
7 
8 
9 
10 
*/