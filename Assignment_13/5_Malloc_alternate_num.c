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

    printf("Alternate elements: ");
    for (i = 0; i < n; i += 2)
        printf("%d ", arr[i]);

    free(arr);
    return 0;
}