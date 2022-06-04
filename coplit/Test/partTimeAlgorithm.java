public class partTimeAlgorithm {
    public static void main(String[] args) {
        System.out.println(partTimeJob(49720));
    }

    public static int partTimeJob(int k) {
        // TODO:
        int[] coin = new int[]{500,100,50,10,5,1};
        int count = 0;

        for(int i = 0; i < coin.length; ++i){
            while (k >= coin[i]){
                k = k - coin[i];
                count++;
            }

        }

        return  count;
    }
}

