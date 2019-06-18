#include <stdio.h>
int main() {
	int n1,d,sum=0,s,t;
  scanf("%d",&n1);
  t=n1;
  while(n1!=0)
  { d=n1%10;
  s=d*d*d;
  sum=sum+s;
  n1=n1/10;
  }
  if(t==sum)
  { printf("Armstrong Number");
  }
  else
  { printf("Not an Armstrong Number");
  }
   return 0;
}