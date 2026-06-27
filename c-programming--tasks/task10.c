#include<stdio.h>
int main(){
	float num;
	int intpart;
	printf("enter a number:");
	scanf("%f",&num);
	intpart=(int)num;
	printf("float   =%.2f\n",num);
	printf("integer =%d",intpart);
	return 0;
}