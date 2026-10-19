#include <stdio.h>
#include <stdlib.h>

int main()
{
    int *arr, n, i;

    printf("Enter array size: ");
    scanf("%d", &n);

    if (n <= 0) return 1;

    arr = (int *)malloc(n * sizeof(int));
    if (arr == NULL) return 1;

    printf("Enter elements:\n");
    for (i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    printf("Even numbers: ");
    for (i = 0; i < n; i++)
        if (arr[i] % 2 == 0)
            printf("%d ", arr[i]);

    printf("\nOdd numbers: ");
    for (i = 0; i < n; i++)
        if (arr[i] % 2 != 0)
            printf("%d ", arr[i]);

    free(arr);
    return 0;
}