#include<stdio.h>
int main(){
	int age;
	printf("enter your age:");
	scanf("%d",&age);
	if (age>=18){
		printf("you are elegibal to vote.\n");
	}else{
		printf("you are not eligible to vote.");
	}
	return 0;
}