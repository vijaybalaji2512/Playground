#include <stdio.h>
int main() 
{
int n,s,t;
 scanf("%d",&n);
 t=n%10;
 while(n!=0)
  {
    s=n%10;
    n=n/10;
  }
  printf("%d",s+t);
  	return 0;
}