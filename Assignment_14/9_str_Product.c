#include <stdio.h>

struct Product
{
    int id;
    char name[50];
    int quantity;
    float price;
};

void store(struct Product *p)
{
    printf("Enter ID, Name, Quantity and Price:\n");
    scanf("%d %49s %d %f",
          &p->id, p->name, &p->quantity, &p->price);
}

void display(struct Product p)
{
    printf("\nProduct Details\n");
    printf("ID: %d\n", p.id);
    printf("Name: %s\n", p.name);
    printf("Quantity: %d\n", p.quantity);
    printf("Price: %.2f\n", p.price);
}

void main()
{
    struct Product p1;

    store(&p1);
    display(p1);
}