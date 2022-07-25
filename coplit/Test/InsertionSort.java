public class InsertionSort {
    public static void main(String[] args) {

        int[] result = insertionSort(new int[]{2,3,1,4});
        System.out.println(result);
    }

    public static int[] insertionSort(int[] arr){

        for(int i = 1; i < arr.length; ++i){
            int target = i;
            while (target > 0 && arr[target] > arr[target - 1]){
                int temp = arr[target - 1];
                arr[target - 1] = arr[target];
                arr[target] = temp;
                target--;
            }
        }

        return arr;
    }
}
