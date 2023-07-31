#include <stdio.h>
#include <string.h>
// user defined

typedef struct student {
  int roll;
  float cgpa;
  char name[100];
} stu;

typedef struct computerengineeringstudent {
  int roll;
  float cgpa;
  char name[100];
} coe;

struct address {
  int houseNo;
  int block;
  char city[100];
  char state[100];
};

typedef struct BankAccount {
  int accountNo;
  char name[100];
} acc;

int main() {
  acc acc1 = {123, "Kashi"};
  acc acc2 = {124, "Batman"};
  acc acc3 = {125, "Loki"};

  printf("acc no = %d \n", acc1.accountNo);
  printf("name = %s \n", acc1.name);

  printf("acc no = %d \n", acc2.accountNo);
  printf("name = %s \n", acc2.name);

  printf("acc no = %d \n", acc3.accountNo);
  printf("name = %s \n", acc3.name);

  return 0;
}
