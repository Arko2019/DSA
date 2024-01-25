package dsa.sort;

public class QuickSort {

    public static int partation(int[] arr, int start, int end) {
        int pivot = end;
        int i = start - 1;

        for (int j = start; j <= end; j++) {
            if (arr[j] <= arr[pivot]) {
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        return i;
    }
    public static void quickSort(int[] arr, int start, int end){
        if(start<end){
            int pivot=partation(arr, start, end);
            quickSort(arr,start,pivot-1);
            quickSort(arr,pivot+1,end);
        }
    }


    public static void print(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");

        }
    }

}
