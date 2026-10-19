#include <stdio.h>

struct Admin
{
    int id;
    char name[50];
    float salary;
    float allowance;
};

void store(struct Admin a)
{
    printf("Enter ID, Name, Salary and Allowance:\n");
    scanf("%d %49s %f %f",
          &a.id, a.name, &a.salary, &a.allowance);
}

void display(struct Admin a)
{
    printf("\nID: %d\n", a.id);
    printf("Name: %s\n", a.name);
    printf("Salary: %.2f\n", a.salary);
    printf("Allowance: %.2f\n", a.allowance);
}

void main()
{
    struct Admin a1;

    store(a1);
    display(a1);
}