#include <stdio.h>
#include <string.h>

struct vector {
  int x;
  int y;
};

void calcSum(struct vector v1, struct vector v2, struct vector sum);
struct complex {
  int real;
  int img;
};


void calcSum(struct vector v1, struct vector v2, struct vector sum) {
  sum.x = v1.x + v2.x;
  sum.y = v1.y + v2.y;
  printf("sum of x is : %d\n", sum.x);
  printf("sum of y is : %d\n", sum.y);
}

int main(){
    struct vector v1 = {5,10};
    struct vector v2 = {5,10};
    struct vector sum = {0};

    calcSum(v1,v2,sum);
}