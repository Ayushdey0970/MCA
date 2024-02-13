#include <stdio.h>
void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}
void printArray(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}
void bubbleSort(int arr[], int size)
{
    for (int i = 0; i < size - 1; i++)
    {
        for (int j = 0; j < size - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                swap(&arr[j], &arr[j + 1]);
            }
        }
        printf("After iteration %d: ", i + 1);
        printArray(arr, size);
    }
}
int main()
{
    int arr[] = {27, 15, 39, 21, 28, 70};
    int size = sizeof(arr) / sizeof(arr[0]);
    printf("Original array: ");
    printArray(arr, size);
    bubbleSort(arr, size);
    printf("Sorted array: ");
    printArray(arr, size);

    return 0;
}
