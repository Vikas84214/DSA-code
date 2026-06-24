package OOPS.CONSTRACTORS.DivideAndConquer;

public class quickSort {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void printQuickSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }

        int pIdx = partition(arr, si, ei);

        printQuickSort(arr, si, pIdx-1);
        printQuickSort(arr, pIdx+1, ei);
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si - 1;

        for(int j = si; j < ei; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i;
    }

    public static void main(String args[]){
        int arr[] = {6, 3, 9, 8, 2, 5};
        printQuickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}