#include <stdio.h>
#include <stdlib.h>

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
        return root;
    }
    else
    {
        if (root->data > value)
        {
            return insertNode(root->left, value);
        }
        else
        {
            return insertNode(root->right, value);
        }
    }
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

void searchElement(struct node *root, int value)
{
    if (root == NULL)
    {
        return;
    }
    else if (root->data == value)
    {
        printf("Data Exists");
    }
    else
    {
        if (root->data > value)
        {
            searchElement(root->left, value);
        }
        else
        {
            searchElement(root->right, value);
        }
    }
}

void main()
{
    struct node *root = NULL;
    int ch, val1, height, check, level, val;

    printf("\n1. Insert\n2. Display\n3. Search\n4. Exit");

    while (ch != 4)
    {
        printf("\nEnter your choice : ");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            printf("\nEnter the data to insert : ");
            scanf("%d", &val1);
            root = insertNode(root, val1);
            printf("\n%d inserted\n", val1);
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
            printf("Enter Element to Search: ");
            scanf("%d", &val);
            searchElement(root, val);
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
