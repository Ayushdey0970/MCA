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
            root->left = insertNode(root->left, value);
        }
        else
        {
            root->right = insertNode(root->right, value);
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

int searchElement(struct node *root, int value)
{
    if (root == NULL)
    {
        return 0;
    }
    else if (root->data == value)
    {
        printf("Data Exists");
        return 1;
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

int countTotalNodes(struct node *root)
{
    if (root == NULL)
    {
        return 0;
    }
    return (countTotalNodes(root->left) + countTotalNodes(root->right) + 1);
}

int largestElement(struct node *root)
{
    while (root->right != NULL)
    {
        root = root->right;
    }
    return root->data;
}

void preorder(struct node *root)
{
    if (root == NULL)
    {
        return;
    }
    printf("%d ", root->data);
    preorder(root->left);
    preorder(root->right);
}

void inorder(struct node *root)
{
    if (root == NULL)
    {
        return;
    }
    inorder(root->left);
    printf("%d ", root->data);
    inorder(root->right);
}

void postorder(struct node *root)
{
    if (root == NULL)
    {
        return;
    }
    postorder(root->left);
    postorder(root->right);
    printf("%d ", root->data);
}

void sorting(struct node *root)
{
    int s;
    printf("Enter Size of Array: ");
    scanf("%d", &s);
    int ar[s];
    printf("Enter Array Elements: ");
    for (int i = 0; i < s; i++)
    {
        scanf("%d", &ar[i]);
    }
    for (int i = 0; i < s; i++)
    {
        root = insertNode(root, ar[i]);
    }
    printf("Sorted Array: ");
    inorder(root);
}

void main()
{
    struct node *root = NULL;
    int ch, val1, height, check, level, val;

    printf("\n1. Insert\n2. Display\n3. Search\n4. Total Nodes\n5. Largest Element\n6. PreOrder\n7. InOrder\n8. PostOrder\n9. Insert through Array\n10. Exit");

    while (ch != 10)
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
            check = searchElement(root, val);
            if (check == 0)
            {
                printf("Data doesn't exist");
            }
            break;
        case 4:
            printf("Total Nodes: " + countTotalNodes(root));
            break;
        case 5:
            printf("Largest Element of this Tree is: " + largestElement(root));
            break;
        case 6:
            preorder(root);
            break;
        case 7:
            inorder(root);
            break;
        case 8:
            postorder(root);
            break;
        case 9:
            sorting(root);
            break;
        case 10:
            printf("Exiting");
            break;
        default:
            printf("Invalid choice");
            break;
        }
    }
}
