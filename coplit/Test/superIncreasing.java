public class superIncreasing {
    public static void main(String[] args) {

        System.out.println(superIncreasing(new int[]{1, 2, 4, 8, 15}));
    }

    public static boolean superIncreasing(int[] arr){
        if(arr.length == 0){
            return false;
        }

        int idx = arr[0];

        for(int i = 1; i < arr.length; ++i){
            if(arr[i] <= idx){
                return false;
            }else{
                idx += arr[i];
            }
        }
        return true;
    }
}
