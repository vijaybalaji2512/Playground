#include<stdio.h>
int main()
{
  int n,d,s,t;
  scanf("%d",&n);
   d=n%10;
  s=n/100;
  printf("%d",d+s);
  return 0;
}