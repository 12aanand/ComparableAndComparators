package CompartorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Numbers {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(34);
        nums.add(12);
        nums.add(23);
        nums.add(32);
        nums.add(14);

//     Comparator is a interface which help to sort the numbers or string using own logic
//        this method to sort the list according to last digit.
        Comparator<Integer> comp = new Comparator<Integer>() {

            public int compare(Integer i, Integer j) {

                if (i % 10 > j % 10) {
                    return 1;
                } else {
                    return -1;
                }

            }
        };

//       if you want to sort this list you have to use collections.sort method directly
        Collections.sort(nums,comp);
        System.out.println(nums);
    }
}
