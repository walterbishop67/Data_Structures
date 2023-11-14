public class BubbleSort {
    public static void main(String[] args) {
    int[] arr = {1,4,2,3,6,5};
    BubbleSort sort = new BubbleSort();
    sort.bubbleSort(arr);
    }
    public void bubbleSort(int[] arr){
        for(int i = arr.length - 1; i > 0; i--){
            for(int k = 0; k < i; k++){
                if (arr[k] > arr[k+1]){
                    int temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }
        for (int j : arr)
            System.out.println(j);
    }
}


