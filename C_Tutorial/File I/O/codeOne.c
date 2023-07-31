#include<stdio.h>

int main(){
    FILE *fptr;
    char ch;
    fptr = fopen("Test.text", "r");

    if(fptr == NULL){
        printf("doesn't Exist \n");
    }else{
        fscanf(fptr,"%c", &ch);
        printf("character in file is : %c\n", ch);
        fscanf(fptr,"%c", &ch);
        printf("character in file is : %c\n", ch);
        fclose(fptr);
    }

    // Writng in a File
    ch = 'M';
    fptr = fopen("NewFile.txt", "w");
    fprintf(fptr, "%cANGO", ch);
    fclose(fptr);

    //fgets
    fptr = fopen("NewFile.txt", "r");
    printf("character in file is : %c\n", fgetc(fptr));
    printf("character in file is : %c\n", fgetc(fptr));
    printf("character in file is : %c\n", fgetc(fptr));
    printf("character in file is : %c\n", fgetc(fptr));
    printf("character in file is : %c\n", fgetc(fptr));
    fclose(fptr);

    //fputc
    fptr = fopen("NewFile.txt", " w");
    fputc('a',fptr);
    fputc('p',fptr);
    fputc('p',fptr);
    fputc('l',fptr);
    fputc('e',fptr);
    fclose(fptr);

    // read the full file (EOF)
    fptr("NewFile.txt", "r");
    ch = fgetc(fptr);
    while(ch != EOF){
        printf("%c", ch);
        ch = fgetc(fptr);
    }
    printf("\n");
    fclose(fptr);
    return 0;
}

