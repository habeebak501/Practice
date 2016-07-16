//to take the string from user to print that string pirticular place
#include<stdio.h>
#include<string.h>
int main()
{
char str[10];
printf("enter the string:\n");
scanf ("%[^\n]%*c", str);
//scanf("%s",str);
printf("hello %s how are u?",str);
return 0;
}


