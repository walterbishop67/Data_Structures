public class SelectionSort {
    public static void main(String[] args) {
        int[] arrray = {1,4,2,3,6,5};
        selectionSort(arrray);
        for (int j : arrray)
            System.out.println(j);
    }
    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(i != minIndex){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
