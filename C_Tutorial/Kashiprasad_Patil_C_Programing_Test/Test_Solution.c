#include <stdio.h>
#include <math.h>


// A. Write a program to check if a given number is Armstrong number or not.
/*
int isArmstrong(int num){
    int orgNum, rem, n = 0, result = 0;
    orgNum = num;

    while(orgNum != 0){
        orgNum/=10;
        ++n;
    }
    orgNum = num;

    while(orgNum !=0){
        rem = orgNum % 10;
        result += pow(rem,n);
        orgNum/=10;
    }

    return (result == num);
}

int main(){
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);

    if(isArmstrong(num)){
        printf("%d is an Armstrong number. \n", num);
    }else{
        printf("%d is not an Armstrong number. \n", num);
    }
}
*/

// E. Write a program in C to print all the letters in english alphabet using a pointer 
/*
int main() {
    char alphabet[26] = "abcdefghijklmnopqrstuvwxyz";
    char *ptr = alphabet;

    printf("English alphabet: ");
    while (*ptr != '\0') {
        printf("%c ", *ptr);
        ptr++;
    }
    
    printf("\n");

    return 0;
}
*/

// D. Write a program to read a string from a file & output to the user. 
/*
int main() {
    FILE *ptr;
    char ch;
    ptr = fopen("test.txt","r");
    if(NULL == ptr){
        printf("file can't be open\n");
    }
    printf("content of this file are: \n");
    do{
        ch =fgetc(ptr);
        printf("%c",ch);
    }while(ch != EOF);

    fclose(ptr);
    return 0;
}
*/

// C. Write a program to print the largest number in an array 
/*
int main() {
    int n, i;
    
    printf("Enter the size of the array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter the elements of the array:\n");
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    int Max = arr[0];

    for (i = 1; i < n; i++) {
        if (arr[i] > Max) {
            Max = arr[i];
        }
    }

    printf("The largest number in the array is: %d\n", Max);

    return 0;
}
*/
// B. Write a function to find square root of a number.

double findSquareRoot(double number) {
    double result = sqrt(number);
    return result;
}

int main() {
    double number;

    printf("Enter a number: ");
    scanf("%lf", &number);
    
    double squareRoot = findSquareRoot(number);
    printf("Square root of %lf is %lf\n", number, squareRoot);
    
    return 0;
}
