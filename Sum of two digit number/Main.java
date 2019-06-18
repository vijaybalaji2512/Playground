#include<stdio.h>
int main()
{
  int n,d;
  scanf("%d",&n);
  d=n%10;
  n=n/10;
  printf("%d",d+n);
  return 0;
}