#include<stdio.h>
int main()
{
int num;
int prime(int num);
int i ,flag=0;
printf("\n enter the any numnber:");
scanf("%d",&num);

for(i=2;i<num;i++)
{

if(num%i==0)
{
flag++;
int res= prime(i);

}

}

if(flag==0)
printf("\n the primefacter is %d",num);

return 0;
}


int prime(int num)
{
int i, count=0;


for(i=2;i<=num/2;i++)
{
count=0;
if(num%i==0)
{


count=count++;
break;
}


}

if(count==0)
{

printf("\n the prime factor are: %d",num);
return num;

}
}
