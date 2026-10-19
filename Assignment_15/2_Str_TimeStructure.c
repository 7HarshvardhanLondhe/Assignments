#include <stdio.h>

struct Time
{
    int hrs;
    int min;
    int sec;
};

void store(struct Time *t)
{
    printf("Enter hours, minutes and seconds: ");
    scanf("%d %d %d", &t->hrs, &t->min, &t->sec);
}

void display(struct Time t)
{
    printf("%02d:%02d:%02d\n", t.hrs, t.min, t.sec);
}

struct Time addTime(struct Time t1, struct Time t2)
{
    struct Time result;

    result.sec = t1.sec + t2.sec;
    result.min = t1.min + t2.min;
    result.hrs = t1.hrs + t2.hrs;

    result.min = result.min + result.sec / 60;
    result.sec = result.sec % 60;

    result.hrs = result.hrs + result.min / 60;
    result.min = result.min % 60;

    return result;
}

int toSeconds(struct Time t)
{
    return t.hrs * 3600 + t.min * 60 + t.sec;
}

int main(void)
{
    struct Time t1, t2, result;

    printf("Enter first time:\n");
    store(&t1);

    printf("Enter second time:\n");
    store(&t2);

    printf("\nFirst time: ");
    display(t1);

    printf("Second time: ");
    display(t2);

    result = addTime(t1, t2);

    printf("Addition result: ");
    display(result);

    printf("First time in seconds: %d\n", toSeconds(t1));
    printf("Second time in seconds: %d\n", toSeconds(t2));

    return 0;
}