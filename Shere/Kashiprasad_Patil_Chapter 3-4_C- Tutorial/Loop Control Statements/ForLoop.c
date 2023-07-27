#include<Stdio.h>
int main(){
    int n;
    printf("Enter a number to get its table: ");
    scanf("%d", &n);

    for(int i=1; i<=10; i++){
        printf("%d\n", n*i);
    }
}

/*it
OUTPUT:
Enter a number to get its table: 12
12
24
36
48
60
72
84
96
108
120*/