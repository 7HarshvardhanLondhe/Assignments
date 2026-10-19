#include <stdio.h>
#include <stdlib.h>

int main()
{
    int *a, *b, *c, n1, n2, i;

    printf("Enter first array size: ");
    scanf("%d", &n1);

    printf("Enter second array size: ");
    scanf("%d", &n2);

    if (n1 <= 0 || n2 <= 0) return 1;

    a = (int *)malloc(n1 * sizeof(int));
    b = (int *)malloc(n2 * sizeof(int));
    c = (int *)malloc((n1 + n2) * sizeof(int));

    if (a == NULL || b == NULL || c == NULL)
    {
        free(a);
        free(b);
        free(c);
        return 1;
    }

    printf("Enter first array:\n");
    for (i = 0; i < n1; i++)
        scanf("%d", &a[i]);

    printf("Enter second array:\n");
    for (i = 0; i < n2; i++)
        scanf("%d", &b[i]);

    for (i = 0; i < n1; i++)
        c[i] = a[i];

    for (i = 0; i < n2; i++)
        c[n1 + i] = b[i];

    printf("Merged array: ");
    for (i = 0; i < n1 + n2; i++)
        printf("%d ", c[i]);

    free(a);
    free(b);
    free(c);
    return 0;
}