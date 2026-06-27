#include<stdio.h>
int main(){
	int a,b;
	float result;
	printf("enter two integers:");
	scanf("%d %d", &a,&b);
	result=(float)a/b;
	printf("division reault: %.2f",result);
	return 0;
}