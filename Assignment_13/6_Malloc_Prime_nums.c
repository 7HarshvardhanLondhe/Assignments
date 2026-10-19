#include <stdio.h>
#include <stdlib.h>

int main()
{
    int *arr, n, i, j, flag;

    printf("Enter array size: ");
    scanf("%d", &n);

    if (n <= 0) return 1;

    arr = (int *)malloc(n * sizeof(int));
    if (arr == NULL) return 1;

    printf("Enter elements:\n");
    for (i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    printf("Prime numbers: ");

    for (i = 0; i < n; i++)
    {
        if (arr[i] < 2)
            continue;

        flag = 0;

        for (j = 2; j < arr[i]; j++)
        {
            if (arr[i] % j == 0)
            {
                flag = 1;
                break;
            }
        }

        if (flag == 0)
            printf("%d ", arr[i]);
    }

    free(arr);
    return 0;
}