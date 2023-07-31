#include<stdio.h>
// #include<math.h>

int sum(int n);
int main(){
    printf("sum is : %d", sum(5)); // sum is : 15
    return 0;
    // int n =4;
    // printf("%f",pow(n,2));
	// return 0;
}

int sum(int n){
    if(n ==1){
        return 1;
    }

    int sumNm1 = sum(n-1);
    int sumN = sumNm1 + n;
    return sumN;
}