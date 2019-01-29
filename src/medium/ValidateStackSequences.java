package medium;

import java.util.ArrayList;
import java.util.List;

public class ValidateStackSequences {

    public static void main(String[] args) {
//        int[] pushed = {1, 2, 3, 4, 5};
//        int[] popped = {4, 5, 3, 2, 1};

        int[] pushed = {1, 0};
        int[] popped = {1, 0};

        System.out.println(validateStackSequences(pushed, popped));
    }

    private static boolean validateStackSequences(int[] pushed, int[] popped) {
        int steps = 0;
        int popIndex = 0;
        List<Integer> pushedNumbers = new ArrayList<>();

        for (int i1 : pushed) {
            pushedNumbers.add(i1);
            steps++;

            if (i1 == popped[popIndex]) {
                popIndex++;
                steps++;

                pushedNumbers.remove(pushedNumbers.size() - 1);

                for (int j = popIndex; j < popped.length; j++) {
                    if (pushedNumbers.size() > 0 && popped[j] == pushedNumbers.get(pushedNumbers.size() - 1)) {
                        popIndex++;
                        steps++;

                        pushedNumbers.remove(pushedNumbers.size() - 1);
                    } else {
                        break;
                    }
                }
            }
        }

        return steps == pushed.length + popped.length;
    }
}
