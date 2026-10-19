#include <stdio.h>
#include <stdlib.h>

int main()
{
    int *arr, n, i, sum = 0;

    printf("Enter array size: ");
    scanf("%d", &n);

    if (n <= 0) return 1;

    arr = (int *)malloc(n * sizeof(int));
    if (arr == NULL) return 1;

    printf("Enter elements:\n");
    for (i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    for (i = 0; i < n; i++)
        sum = sum + arr[i];

    printf("Sum = %d\n", sum);

    free(arr);
    return 0;
}