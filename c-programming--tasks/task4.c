#include<stdio.h>
int main(){
	const float PI=3.14159;
	printf("value of pi:%.5f\n",PI);
	float radius=5,area;
	area=PI*radius*radius;
	printf("are of circle with radius %.2f=%.2f\n",radius,area);
	return 0;
}