public class MergeSort {
    void merge(int arr[], int p, int q, int r ){
        // here ,p = 0 , q = 4, r = 6(chi so cua mang)
int n1 = q-p;
int n2 = r-q;
int L[] = new int[n1];
int M[] = new int[n2];
int i,j,k=0;

for(i = 0 ; i< n1 ; i++){
    L[i] = arr[p+i];
}
for( j = 0 ; j < n2; j++){
    M[j] = arr[q + j +1];
}
i=0;
j=0;
k = p;
while(i < n1 && j<n2){
    if(L[i] <= M[j]){
        arr[k] = L[i];
        i++;
    }
    else{
        arr[k] = M[j];
        j++;
    }
    k++;
}

while(i< n1){
    arr[k] = L[i];
    i++;
    k++;
}

while (j < n2) {
            arr[k] = M[j];
            j++;
            k++;
        }

    }
    void mergeSort(int arr[], int l, int r) {
        if (l < r) {

            // m is the point where the array is divided into two subarrays
            int m = (l + r) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted subarrays
            merge(arr, l, m, r);
        }
    }
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n -1; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {5,6, 12, 10, 9, 19};

        MergeSort ob = new MergeSort();
        ob.mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        ob.printArray(arr);
    }
}
