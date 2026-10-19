#include<stdio.h>

typedef struct student{
	int rollno;
	char name[20];
	int marks;
}Student;

storeStudents(Student* sarr,int size)
{
	for(int i=0;i<size;i++)
	{
		scanf("%d",&sarr[i].rollno);
		scanf("%s",sarr[i].name);
		scanf("%d",&sarr[i].marks);	
	}
}
displayStudents(Student* sarr,int size)
{
	for(int i=0;i<size;i++)
	{
		printf("\nRoll_no=%d",sarr[i].rollno);
		printf("\nName=%s",sarr[i].name);
		printf("\nMarks=%d",sarr[i].marks);	
	}
}
void main()
{
	Student arr[5],brr[7],crr[10];
	printf("enter users details arr\n");
	storeStudents(arr,5);
	printf("enter users details brr\n");
	storeStudents(brr,7);
	printf("enter users details crr\n");
	storeStudents(crr,10);
	
	
	printf("display user details\n");
	displayStudents(arr,5);	
}