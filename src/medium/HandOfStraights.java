package medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class HandOfStraights {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6, 2, 3, 4, 7, 8};
        int[] array2 = {1, 1, 2, 2, 3, 3};
        int w = 3;
        int w2 = 2;

        HandOfStraights handOfStraights = new HandOfStraights();
        System.out.println(handOfStraights.isNStraightHand2(array, w));
        System.out.println(handOfStraights.isNStraightHand(array2, w2));
    }


    private boolean isNStraightHand(int[] hand, int W) {
        boolean isStraightHand = true;

        if (hand.length % W != 0) {
            return false;
        }

        List<Integer> list = Arrays.stream(hand).boxed().sorted().collect(Collectors.toCollection(LinkedList::new));
        int size = list.size();

        for (int i = 0; i < size / W; i++) {
            int times = 1;
            int element = list.get(0);

            list.remove(0);

            for (int j = 0; j < list.size() && times != W; j++) {
                if (element + 1 == list.get(j)) {
                    element = list.get(j);
                    list.remove(list.get(j));
                    times++;
                    j = -1;
                }
            }

            if (times != W) {
                isStraightHand = false;
                break;
            }
        }

        return isStraightHand;
    }

    private boolean isNStraightHand2(int[] hand, int W) {
        if (W == 1) return true;
        if (hand.length % W != 0) return false;

        int[] bucket = new int[W];

        for (int n : hand) {
            bucket[n % W]++;
        }

        for (int i = 1; i < bucket.length; ++i) {
            if (bucket[i] != bucket[i - 1]) return false;
        }

        return true;
    }
}
