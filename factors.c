 /*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          #include <stdio.h>
int primeno(int);
int main()
{
    int number,i;

    printf("Enter a positive integer: ");
    scanf("%d",&number);
    printf("Factors of %d are:\n ", number);

    for(i=1; i <number; ++i)
    {
        if (number%i == 0)
        {
          primeno(i);
            number=number/i;
          // printf("%d ",i);
        }
    }

    return 0;
}
int primeno(int n)
{
int count=0;
int j;
for(j=2;j<=n;j++)
{
if(n%j==0)
{
count++;
}

if(count==1)
printf("%d\n",n);
return n;

}
}
*/
#include<stdio.h>
int main()
{
int i,n;
printf("enter any number:\n");
scanf("%d",&n);
for(i=2;i*i<=n;i++)
{
while(n%i==0)
{
printf("%d\n",i);
n=n/i;
}
}
if(n>1)
printf("%d\n",n);
return 0;
}
                    
