public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {1,4,2,3,6,5};
        insertionSort(array);
        for (int j : array)
            System.out.println(j);
    }
    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            while(j > - 1 && temp < arr[j]){
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}
