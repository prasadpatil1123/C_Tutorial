#include<stdio.h>
int main() {
printf("%d \n", 8<9 && 2<5); // 1
printf("%d \n", 2<8 && 9<4); // 0

printf("%d \n", 3<3 || 5<4); // 0
printf("%d \n", 3>4 || 5>4); // 1

printf("%d \n", 2<4 && 2<5); // 1

printf("%d \n", !(1<4 && 1<5)); // 0
printf("%d \n", !(5<3 || 6<4)); // 1
return 0;
}