#include <stdio.h>
#include <stdlib.h>

int main()
{
    int *a, *b, *c, n, i;

    printf("Enter array size: ");
    scanf("%d", &n);

    if (n <= 0) return 1;

    a = (int *)malloc(n * sizeof(int));
    b = (int *)malloc(n * sizeof(int));
    c = (int *)malloc(n * sizeof(int));

    if (a == NULL || b == NULL || c == NULL)
    {
        free(a);
        free(b);
        free(c);
        return 1;
    }

    printf("Enter first array:\n");
    for (i = 0; i < n; i++)
        scanf("%d", &a[i]);

    printf("Enter second array:\n");
    for (i = 0; i < n; i++)
        scanf("%d", &b[i]);

    for (i = 0; i < n; i++)
        c[i] = a[i] + b[i];

    printf("Third array: ");
    for (i = 0; i < n; i++)
        printf("%d ", c[i]);

    free(a);
    free(b);
    free(c);
    return 0;
}