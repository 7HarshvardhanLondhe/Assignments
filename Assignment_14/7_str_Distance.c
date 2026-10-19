#include <stdio.h>

struct Distance
{
    int feet;
    float inch;
};

void store(struct Distance *d)
{
    printf("Enter feet and inches: ");
    scanf("%d %f", &d->feet, &d->inch);
}

void display(struct Distance d)
{
    printf("Distance: %d feet %.2f inches\n",
           d.feet, d.inch);
}

void main()
{
    struct Distance d1;

    store(&d1);
    display(d1);
}