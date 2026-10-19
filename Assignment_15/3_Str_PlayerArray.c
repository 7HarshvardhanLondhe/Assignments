#include <stdio.h>

struct Player
{
    char name[50];
    int matches;
    int runs;
    int wickets;
};
void store(struct Player p[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("\nEnter details of player %d:\n", i + 1);

        printf("Name: ");
        scanf("%49s", p[i].name);

        printf("Matches played: ");
        scanf("%d", &p[i].matches);

        printf("Runs: ");
        scanf("%d", &p[i].runs);

        printf("Wickets: ");
        scanf("%d", &p[i].wickets);
    }
}

void display(struct Player p[], int n)
{
    printf("\n--- All Player Details ---\n");

    for (int i = 0; i < n; i++)
    {
        printf("\nName: %s\n", p[i].name);
        printf("Matches: %d\n", p[i].matches);
        printf("Runs: %d\n", p[i].runs);
        printf("Wickets: %d\n", p[i].wickets);
    }
}

void findMaximum(struct Player p[], int n)
{
    int maxRuns = 0;
    int maxWickets = 0;

    for (int i = 1; i < n; i++)
    {
        if (p[i].runs > p[maxRuns].runs)
        {
            maxRuns = i;
        }

        if (p[i].wickets > p[maxWickets].wickets)
        {
            maxWickets = i;
        }
    }

    printf("\n--- Player With Maximum Runs ---\n");
    printf("Name: %s\n", p[maxRuns].name);
    printf("Runs: %d\n", p[maxRuns].runs);

    printf("\n--- Player With Maximum Wickets ---\n");
    printf("Name: %s\n", p[maxWickets].name);
    printf("Wickets: %d\n", p[maxWickets].wickets);
}

int main(void)
{
    struct Player p[10];

    store(p, 10);
    display(p, 10);
    findMaximum(p, 10);

    return 0;
}