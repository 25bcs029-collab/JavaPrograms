#include<stdio.h>
int main(){
	int mark = 76;
	float avg = 72.4;
	char grade = 'B';
	char name[50] = "meka";
	const float PI = 3.14159;
	printf("name = %s\n",name);
	printf("mark = %d\n",mark);
	printf("avg = %.1f \n",avg);
	printf("pi value = %.5f \n",PI);
	if (mark>50){
		printf("%c",grade);
	}
	return 0;
}