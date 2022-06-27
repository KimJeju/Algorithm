public class bubbleSort {
    public static void main(String[] args) {

        int[] output = bubbleSort(new int[]{2, 1, 3});
        System.out.println(output);


    }


    public static int[] swap(int idx1, int idx2, int[] arr) {
        //두 변수를 바꾸는 방법
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;

        return arr;
    }

    // naive solution
    public static int[] bubbleSort(int[] arr) {
        int arrLength = arr.length;


        for (int i = 0; i < arrLength; ++i) {
            int swaps = 0;

            for (int j = 0; j < arrLength; ++j) {
                if (arr[j] > arr[j + 1]) {
                    swaps++;
                    arr = swap(j, j + 1, arr);
                }


            }

            if (swaps == 0) {
                break;
            }
        }

        return arr;
    }
}
