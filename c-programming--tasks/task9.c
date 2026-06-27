#include<stdio.h>
int main(){
	int num;
	printf("enter a number:");
	scanf("%d",&num);
	(num>0) ? printf("positive\n"):
		(num<0) ? printf("negative\n"): printf("zero");
		return 0;
}