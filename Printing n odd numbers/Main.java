#include <stdio.h>
int main() {
	int n,i,j;
  scanf("%d",&n);
  for(i=1;i<n*2;i+=2)
  {
    if(n%2==1)
   {
     printf("%d\n",i);
   }
  }
  return 0;
}