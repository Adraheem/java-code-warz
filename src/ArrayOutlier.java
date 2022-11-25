import java.util.ArrayList;
import java.util.List;

public class ArrayOutlier {

    public static int detect(List<Integer> nums) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for(int num : nums){
            if(num % 2 == 0){
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        if(even.size() == 1){
            return even.get(0);
        } else {
            return odd.get(0);
        }
    }
}
