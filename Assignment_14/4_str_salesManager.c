#include <stdio.h>

struct SalesManager
{
    int id;
    char name[50];
    float salary;
    float incentive;
    int target;
};

void store(struct SalesManager *s)
{
    printf("Enter ID, Name, Salary, Incentive and Target:\n");
    scanf("%d %49s %f %f %d",
          &s->id, s->name, &s->salary,
          &s->incentive, &s->target);
}

void display(struct SalesManager s)
{
    printf("\nID: %d\n", s.id);
    printf("Name: %s\n", s.name);
    printf("Salary: %.2f\n", s.salary);
    printf("Incentive: %.2f\n", s.incentive);
    printf("Target: %d\n", s.target);
}

void main()
{
    struct SalesManager s1;

    store(&s1);
    display(s1);
}