package dsa.sort;

public class Main {
    public static void main(String[] args) {
        int arr[]={1,4,7,2,5,3};
        QuickSort.quickSort(arr,0,arr.length-1);
        QuickSort.print(arr);
    }
}
