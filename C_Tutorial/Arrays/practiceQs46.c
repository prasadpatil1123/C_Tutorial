#include<stdio.h>
void storeTable(int arr[][10], int n, int m, int number);
int main(){
    int tables[2][10];
    storeTable(tables,0,10,2);
        storeTable(tables,1,10,2);

    for(int i =0 ; i < 10; i++){
        printf("%d \t", tables[0][i]);
    }
    for(int i =0 ; i < 10; i++){
        printf("%d \t", tables[1][i]);
    }
    printf("\n");
	return 0;
}
void storeTable(int arr[][10], int n, int m, int number){
     for(int i =0 ; i < m; i++){
       arr[n][i]= number* (i +1);
    }
}

/*
2       4       6       8       10      12      14      16      18                                 20       2       4       6       8       10      12      14      16                                 18       20
*/