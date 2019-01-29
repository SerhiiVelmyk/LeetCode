package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Permutation {

    private List<List<Integer>> list = new ArrayList<>();

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Permutation permutation = new Permutation();
        System.out.println(permutation.permute(array));
    }

    private List<List<Integer>> permute(int[] nums) {
        return helper(nums, 0);
    }


    private List<List<Integer>> helper(int[] array, int index) {
        List<Integer> localList;

        for (int i = index; i < array.length; i++) {
            int t = array[index];
            array[index] = array[i];
            array[i] = t;

            localList = Arrays.stream(array).boxed().collect(Collectors.toList());

            if (!list.contains(localList)) {
                list.add(localList);
            }


            helper(array, index + 1);

            t = array[index];
            array[index] = array[i];
            array[i] = t;
        }

        return list;
    }
}
