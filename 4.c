#include<stdio.h>
int main()
{
	int i,n,result=1;
	printf("enter the n value:\n");
	scanf("%d",&n);
	if(n>=0&&n<=30)
	{     
                  for(i=0;i<n;i++)
		
		{
			result=result*2;
                        //sum= sum+result;
		
		}
	}
	else
	{
		printf("you entered more than 31\n");
                     return;
	}
          printf("%d",result);
return 0;
}
