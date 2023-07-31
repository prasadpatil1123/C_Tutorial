#include<stdio.h>

int calcPercentage(int science, int math, int sanskrit);

int main(){

    int sc = 86;
    int m = 95;
    int sk = 92;
    printf("Percentage is : %d", calcPercentage(sc,m,sk)); // Percentage is : 91
	return 0;
}

int calcPercentage(int science, int math, int sanskrit){
    return ((science+math+sanskrit)/3);
}