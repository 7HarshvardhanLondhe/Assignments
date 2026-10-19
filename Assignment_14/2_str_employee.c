#include <stdio.h>

struct Employee
{
    int id;
    char name[50];
    float salary;
};

void store(struct Employee *e)
{
    printf("Enter ID: ");
    scanf("%d", &e->id);

    printf("Enter Name: ");
    scanf("%49s", e->name);

    printf("Enter Salary: ");
    scanf("%f", &e->salary);
}

void display(struct Employee *e)
{
    printf("\nEmployee Details\n");
    printf("ID: %d\n", e->id);
    printf("Name: %s\n", e->name);
    printf("Salary: %.2f\n", e->salary);
}

void main()
{
    struct Employee e1;

    store(&e1);
    display(&e1);
}