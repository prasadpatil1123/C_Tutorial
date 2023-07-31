# include <stdio.h>
int main(){

// int marksl = 97;
// int marks2 = 98
// int marks3 = 89

int marks[3];

printf("Enter phy = ");
scanf("%d", &marks[0]);

printf("Enter chem = ");
scanf("%d", &marks[1]);

printf("Enter Math = ");
scanf("%d", &marks[2]);

printf("phy = %d, chem = %d, Math = %d", marks[0], marks[1], marks[2]);
return 0;
}

/*
Enter phy = 50
Enter chem = 70
Enter Math = 90
phy = 50, chem = 70, Math = 90
*/
