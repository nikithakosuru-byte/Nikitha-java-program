class MergeSort {
    void merge(int arr[], int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[low + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];
        int i = 0, j = 0;
        int k = low;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    void sort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right)/2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    static void printArray(int arr[]) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = { 25,8,9,6,5,67 };
        System.out.println("Given Array:");
        printArray(arr);
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);
        System.out.println("\nSorted Array:");
        printArray(arr);
    }
}
