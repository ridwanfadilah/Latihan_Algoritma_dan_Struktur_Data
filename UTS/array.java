public class Array {
    public int partisi (int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j<=high-1; j++){
            if (arr[j] <= pivot){
                i++;
                //swap(A[i], A[j]);
                int temp = arr[i];
                arr[j] = temp;
            }
        }
        //swap(A[i+1], A[high]);
        int temp = arr [i +1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return(i+1);
    }
    public void sort (int[] arr, int low, int high){
        if (low<high){
            int p = partisi (arr, low, high);
            sort(arr, low,p - 1);
            sort(arr, p+1, high);
        }
    }
}
