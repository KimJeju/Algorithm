import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class isSubsetOf {
    public static void main(String[] args) {

        int[] base = new int[]{10, 99, 123, 7};
        int[] sample = new int[]{11, 100, 99, 123};

        System.out.println(isSubsetOf(base,sample));
    }

    public static boolean isSubsetOf(int[] base, int[] sample) {
        // TODO:
        List<Integer> list = Arrays.stream(base)
                .boxed()
                .collect(Collectors.toList());

        for(int i : sample){
            if(!list.contains(i)){
                return false;
            }
        }
        return true;
    }
}
