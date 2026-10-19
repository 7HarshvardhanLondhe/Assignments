#include <stdio.h>
#include <stdlib.h>

int main()
{
    int *arr, n, i, j, temp;

    printf("Enter array size: ");
    scanf("%d", &n);

    if (n <= 0) return 1;

    arr = (int *)malloc(n * sizeof(int));
    if (arr == NULL) return 1;

    printf("Enter elements:\n");
    for (i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    for (i = 0; i < n - 1; i++)
    {
        for (j = 0; j < n - 1 - i; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    printf("Sorted array: ");
    for (i = 0; i < n; i++)
        printf("%d ", arr[i]);

    free(arr);
    return 0;
}