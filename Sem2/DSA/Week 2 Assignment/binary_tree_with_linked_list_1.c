#include <stdio.h>
#include <stdlib.h>
#include <time.h>

struct node
{
    int data;
    struct node *left, *right;
};

struct node *createNode(int value)
{
    struct node *newNode = (struct node *)malloc(sizeof(struct node));
    newNode->data = value;
    newNode->left = NULL;
    newNode->right = NULL;

    return newNode;
}

struct node *insertNode(struct node *root, int value)
{
    if (root == NULL)
    {
        root = createNode(value);
    }
    else
    {
        int c;
        printf("pointer at %d", root->data);
        printf("\n1. Left\n2. Right\n");
        scanf("%d", &c);

        if (c == 1)
        {
            root->left = insertNode(root->left, value);
        }
        else
        {
            root->right = insertNode(root->right, value);
        }
    }
    return root;
}

void displayLevelOrder(struct node *root, int level)
{
    if (root == NULL)
    {
        printf("NULL ");
        return;
    }

    if (level == 1)
    {
        printf("%d ", root->data);
    }
    else if (level > 1)
    {
        displayLevelOrder(root->left, level - 1);
        displayLevelOrder(root->right, level - 1);
    }
}

int findHeight(struct node *root)
{
    if (root == NULL)
    {
        return 0;
    }

    int leftHeight = findHeight(root->left);
    int rightHeight = findHeight(root->right);

    return (leftHeight > rightHeight) ? (leftHeight + 1) : (rightHeight + 1);
}

void displayLevelWise(struct node *root)
{
    int height = findHeight(root);
    for (int i = 1; i <= height; i++)
    {
        displayLevelOrder(root, i);
        printf("\n");
    }
}

int searchElement(struct node *root, int value)
{
    if (root == NULL)
    {
        return 0;
    }
    if (root->data == value)
    {
        return 1; // Element found
    }

    // Recursively search in the left and right subtrees
    if (searchElement(root->left, value) || searchElement(root->right, value))
    {
        return 1; // Element found in either subtree
    }

    return 0;
}

void main()
{
    struct node *root = NULL;
    int ch, val, check;
    clock_t start, end;

    printf("\n1. Insert\n2. Display\n3. Search\n4. Exit\n");

    while (ch != 4)
    {
        printf("\nEnter your choice : ");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            printf("\nEnter the data to insert : ");
            scanf("%d", &val);
            root = insertNode(root, val);
            printf("\n%d inserted\n", val);
            break;
        case 2:
            if (root == NULL)
            {
                printf("\nNothing to display\n");
            }
            printf("\nThe tree structure : \n");
            displayLevelWise(root);
            break;
        case 3:
            printf("Enter Value to Search: ");
            scanf("%d", &val);
            start = clock();
            check = searchElement(root, val);
            if (check == 0)
            {
                printf("Data Doesn't Exist");
            }
            else
            {
                printf("Data Exists");
            }
            end = clock();
            printf("\nTime Taken: %f", ((double)(end - start)) / CLOCKS_PER_SEC);
            break;
        case 4:
            printf("Exiting");
            break;
        default:
            printf("Invalid choice");
            break;
        }
    }
}
