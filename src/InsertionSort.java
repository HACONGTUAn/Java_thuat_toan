public class InsertionSort {
    int i = 0;
    int arr[];
    InsertionSort(int size){
        arr= new int[size];
    }
    void add_arr(int x){
        arr[i] = x;
        i++;
    }
    void prin_arr(){
        for(i = 0 ; i < arr.length - 1 ;i++){
            System.out.print( arr[i]+"-");
        }
    }
    void insertionsort(){
        int key;
        for( i = 0 ; i < arr.length -1 ; i++)
        {
            key = arr[i+1];
            for ( int j = 0 ; j < i  ; j ++ ) {
                if(key < arr[j]){
                    arr[i+1] = arr[j];
                    arr[j] = key;
                }

            }


        }
        System.out.println("\n"+ " sau khi sap xep ");
        for(i = 0 ; i < arr.length - 1 ;i++){
            System.out.print( arr[i]+"-");
        }
    }

    public static void main(String[] args) {
        InsertionSort inser = new InsertionSort(8);
        inser.add_arr(9);
        inser.add_arr(5);
        inser.add_arr(4);
        inser.add_arr(7);
        inser.add_arr(10);
        inser.add_arr(12);
        inser.add_arr(20);
        inser.add_arr(99);
        inser.prin_arr();
        inser.insertionsort();
    }
}
