# include <stdio.h>
# include <string.h>
// void printString(char arr[]);
// int countLength(char arr[]);
// void salting(char password[]);
// void slice(char str[], int n, int m);
//int countVowels(char str[]);

void checkChar(char str[], char ch);
int main() {
char str[] = "AkurdiStation";
char ch = 'x';
checkChar(str, ch);
}

void checkChar(char str[], char ch) {
for(int i=0; str[i] != '\0'; i++) {
if(str[i] == ch) {
printf("character is present!");
return;

}
}
printf("character is NOT present:(");
}