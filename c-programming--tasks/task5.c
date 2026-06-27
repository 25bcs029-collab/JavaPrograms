#include<stdio.h>
int main(){
	float num1,num2;
	printf("enter first number:");
	scanf("%f",&num1);
	printf("enter second number:");
	scanf("%f",&num2);
	float sum=num1+num2;
	float difference=num1-num2;
	float product=num1*num2;
	printf("\n---result---\n");
	printf("sum         =%.2f\n",sum);
	printf("difference  =%.2f\n",difference);
	printf("product     =%.2f",product);
	return 0;
}