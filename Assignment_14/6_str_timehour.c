#include <stdio.h>

struct Time
{
    int hour;
    int min;
    int sec;
};

void store(struct Time *t)
{
    printf("Enter hour, minute and second: ");
    scanf("%d %d %d", &t->hour, &t->min, &t->sec);
}

void display(struct Time t)
{
    printf("Time: %02d:%02d:%02d\n",
           t.hour, t.min, t.sec);
}

void main()
{
    struct Time t1;

    store(&t1);
    display(t1);
}