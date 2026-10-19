#include <stdio.h>

struct Product
{
    char name[50];
    float price;
    int quantity;
};

void store(struct Product p[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("\nEnter product %d details:\n", i + 1);

        printf("Product name: ");
        scanf("%49s", p[i].name);

        printf("Price: ");
        scanf("%f", &p[i].price);

        printf("Quantity: ");
        scanf("%d", &p[i].quantity);
    }
}

void display(struct Product p[], int n)
{
    float total = 0;

    printf("\n========== BILL ==========\n");
    printf("%-15s %10s %10s %12s\n",
           "Product", "Price", "Quantity", "Amount");

    for (int i = 0; i < n; i++)
    {
        float amount = p[i].price * p[i].quantity;

        printf("%-15s %10.2f %10d %12.2f\n",
               p[i].name, p[i].price,
               p[i].quantity, amount);

        total = total + amount;
    }

    printf("-------------------------------\n");
    printf("Total Cost: %.2f\n", total);
}

int main(void)
{
    struct Product cart[50];
    int n;

    printf("How many products do you want to add? ");
    scanf("%d", &n);

    if (n <= 0 || n > 50)
    {
        printf("Invalid number of products.\n");
        return 1;
    }

    store(cart, n);
    display(cart, n);

    return 0;
}