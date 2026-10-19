#include <stdio.h>

struct Date
{
    int date;
    int month;
    int year;
};

void store(struct Date *d)
{
    printf("Enter date, month and year: ");
    scanf("%d %d %d", &d->date, &d->month, &d->year);
}

void display(struct Date d)
{
    printf("Date: %02d/%02d/%04d\n",
           d.date, d.month, d.year);
}

void main()
{
    struct Date d1;

    store(&d1);
    display(d1);
}