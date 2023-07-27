#include <stdio.h>
int main()
{
    int n;
    printf("Enter a number:");
    scanf("%d", &n);

    int i = 1;
    do
    {

        printf("%d\n", i);

        i++;
    } while (i <= n);
}

/*
OTUPUT:
Enter a number:10
1
2
3
4
5
6
7
8
9
10
*/