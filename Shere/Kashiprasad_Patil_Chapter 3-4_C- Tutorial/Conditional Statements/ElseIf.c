#include<stdio.h>
int main(){
    int score;
    printf("ENter your score to check your grade: ");
    scanf("%d", &score);

    if(score < 35 && score > 0 ){
        printf("Fail");
    }
    else if(score >= 35 && score < 50){
    printf("D");
    }
    else if(score >= 50 && score <= 60){
    printf("C");
    }
    else if(score > 60 && score <= 75){
    printf("B");
    }
    else if(score > 75 &&  score <= 85){
    printf("A");
    }
    else{
        printf("A+");
    }
}

/*
OUTPUT:
ENter your score to check your grade: 50
D
ENter your score to check your grade: 85
D
ENter your score to check your grade: 86
D
ENter your score to check your grade: 65
D
ENter your score to check your grade: 10
Fail
ENter your score to check your grade: 95
D
ENter your score to check your grade: 5
Fail
ENter your score to check your grade: 20
Fail
ENter your score to check your grade: 50
C
ENter your score to check your grade: 60
C
ENter your score to check your grade: 79
A
ENter your score to check your grade: 95
A+
*/