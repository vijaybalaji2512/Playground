#include <stdio.h>
int fact(int d)
{
 if(d>1)
  return d*fact(d-1);
  else
    return 1;
}
int main() 
{
  int n,sum=0,d,n1,t;
  scanf("%d",&n);
  n1=n;
  while(n!=0)
 {
   d=n%10;
   t=fact(d);
   sum=sum+t;
   n=n/10;
 }  
  if(n1==sum)
  {
   printf("Yes");
  }
  else
  {
    printf("No");
  }          

  return 0;
}