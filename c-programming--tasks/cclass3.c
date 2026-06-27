#include<stdio.h>
int main(){
	char name[50];
	int age;
	float mark1, mark2;
	printf("enter the name :");
	scanf("%s",name);
	printf("enter your age :");
	scanf("%d",&age);
	fflush(stdin);
	printf("enter your mark 1 :");
	scanf("%.2f",&mark1);
	fflush(stdin);
	printf("enter mark 2 :");
	scanf("%f",&mark2);
	float avg = (mark1 + mark2)/2.0;
	printf("------------student details-----------\n");
	printf("your name  is %s\n",name);
	printf("your age is %d \n",age);
	fflush(stdin);
	printf("your marks are %.2f and %.2f \n",mark1, mark2);
	printf("your average of the two marks is %d \n",avg);
	return 0;
}