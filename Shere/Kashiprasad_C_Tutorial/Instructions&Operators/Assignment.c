# include <stdio.h>
int main() {
int a = 10;
a += 10;
printf("a+10 = %d \n", a); // a+10 = 20 
a -= 10;
printf("a-10 = %d \n", a); // a-10 = 10 
a *= 10;
printf("a*10 = %d \n", a); // a*10 = 100 
a /= 10;
printf("a/10 = %d \n", a); // a/10 = 10 
a %= 10;
printf("a%c10 = %d \n", '%', a); // a%10 = 0 s
return 0;
}