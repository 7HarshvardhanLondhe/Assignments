#include <stdio.h>
#include <string.h>

struct Movie
{
    int id;
    char title[50];
    char director[50];
    int year;
    char genre[30];
};

void store(struct Movie *m)
{
    printf("Enter movie ID: ");
    scanf("%d", &m->id);

    printf("Enter movie title: ");
    scanf(" %49[^\n]", m->title);

    printf("Enter director: ");
    scanf(" %49[^\n]", m->director);

    printf("Enter release year: ");
    scanf("%d", &m->year);

    printf("Enter genre: ");
    scanf(" %29[^\n]", m->genre);
}

void display(struct Movie m)
{
    printf("\nMovie ID: %d\n", m.id);
    printf("Title: %s\n", m.title);
    printf("Director: %s\n", m.director);
    printf("Release Year: %d\n", m.year);
    printf("Genre: %s\n", m.genre);
}

int search(struct Movie m[], int n, int id)
{
    for (int i = 0; i < n; i++)
    {
        if (m[i].id == id)
        {
            return i;
        }
    }

    return -1;
}

int main(void)
{
    struct Movie movies[100];
    int n = 0;
    int choice;
    int id;
    int index;

    do
    {
        printf("\n===== MOVIE DATABASE =====\n");
        printf("1. Add Movie\n");
        printf("2. Display All Movies\n");
        printf("3. Search Movie\n");
        printf("4. Update Movie\n");
        printf("5. Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        switch (choice)
        {
            case 1:
                if (n >= 100)
                {
                    printf("Database is full.\n");
                    break;
                }

                printf("\nEnter movie details:\n");
                store(&movies[n]);
                n++;

                printf("Movie added successfully.\n");
                break;

            case 2:
                if (n == 0)
                {
                    printf("No movies available.\n");
                    break;
                }

                for (int i = 0; i < n; i++)
                {
                    display(movies[i]);
                }
                break;

            case 3:
                printf("Enter movie ID to search: ");
                scanf("%d", &id);

                index = search(movies, n, id);

                if (index != -1)
                {
                    printf("Movie found:\n");
                    display(movies[index]);
                }
                else
                {
                    printf("Movie not found.\n");
                }
                break;

            case 4:
                printf("Enter movie ID to update: ");
                scanf("%d", &id);

                index = search(movies, n, id);

                if (index != -1)
                {
                    printf("Enter updated details:\n");

                    store(&movies[index]);

                    printf("Movie updated successfully.\n");
                }
                else
                {
                    printf("Movie not found.\n");
                }
                break;

            case 5:
                printf("Exiting database.\n");
                break;

            default:
                printf("Invalid choice.\n");
        }

    } while (choice != 5);

    return 0;
}