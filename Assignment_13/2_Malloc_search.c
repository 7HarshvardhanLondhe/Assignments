#include<stdio.h>
#include<stdlib.h>
int main()
{
	int *arr,n,i;
	printf("enter array size: ");
	scanf("%d",&n);
	
	arr=(int*)malloc(n * sizeof(int));
	
	if (arr == NULL)
    {
        printf("Memory allocation failed");
        return 1;
    }
	printf("enter array elements:\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	int s;
	printf("enter your search number from array: ");
	scanf("%d",&s);
	for(i=0;i<n;i++)
	{
		if(arr[i]==s)
		{
			printf("element found at index %d",i);
		}	
	}
	free(arr);
}