#include <stdio.h>
int main(){
	char name[50];
	char grade;
	int age;
	printf("enter a name: ");
	scanf("%s", name);
	printf("enter a grade: ");
	scanf("%c", &grade);
	printf("enter a age: ");
	scanf("%d", &age);
	printf("\n---student details---\n");
	printf("name  :%s\n", name);
	printf("grade :%c\n", grade);
	printf("age   :%d\n ", age);
	return 0;
}