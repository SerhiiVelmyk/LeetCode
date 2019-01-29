package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueueReconstruction {

    private static int count = 1;

    public static void main(String[] args) {
        int[][] aa = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        int[][] aa2 = {{6, 0}, {5, 0}, {4, 0}, {3, 2}, {2, 2}, {1, 4}};
        int[][] aa3 = {{40, 11}, {81, 12}, {32, 60}, {36, 39}, {76, 19}, {11, 37}, {67, 13}, {45, 39}, {99, 0},
                {35, 20}, {15, 3}, {62, 13}, {90, 2}, {86, 0}, {26, 13}, {68, 32}, {91, 4}, {23, 24}, {73, 14},
                {86, 13}, {62, 6}, {36, 13}, {67, 9}, {39, 57}, {15, 45}, {37, 26}, {12, 88}, {30, 18}, {39, 60},
                {77, 2}, {24, 38}, {72, 7}, {96, 1}, {29, 47}, {92, 1}, {67, 28}, {54, 44}, {46, 35}, {3, 85}, {27, 9},
                {82, 14}, {29, 17}, {80, 11}, {84, 10}, {5, 59}, {82, 6}, {62, 25}, {64, 29}, {88, 8}, {11, 20}, {83, 0},
                {94, 4}, {43, 42}, {73, 9}, {57, 32}, {76, 24}, {14, 67}, {86, 2}, {13, 47}, {93, 1}, {95, 2}, {87, 8},
                {8, 78}, {58, 16}, {26, 75}, {26, 15}, {24, 56}, {69, 9}, {42, 22}, {70, 17}, {34, 48}, {26, 39}, {22, 28},
                {21, 8}, {51, 44}, {35, 4}, {25, 48}, {78, 18}, {29, 30}, {13, 63}, {68, 8}, {21, 38}, {56, 20}, {84, 14},
                {56, 27}, {60, 40}, {98, 0}, {63, 7}, {27, 46}, {70, 13}, {29, 23}, {49, 6}, {5, 64}, {67, 11}, {2, 31},
                {59, 8}, {93, 0}, {50, 39}, {84, 6}, {19, 39}};

        System.out.println(Arrays.deepToString(reconstructQueue(aa)));
        System.out.println(Arrays.deepToString(reconstructQueue(aa2)));
        System.out.println(Arrays.deepToString(reconstructQueue2(aa3)));
    }

    private static int[][] reconstructQueue2(int[][] people) {
        Arrays.sort(people, (o1, o2) -> o1[0] != o2[0] ? o2[0] - o1[0] : o1[1] - o2[1]);
        List<int[]> res = new ArrayList<>();
        for (int[] cur : people)
            res.add(cur[1], cur);
        return res.toArray(new int[people.length][]);
    }

    private static int[][] reconstructQueue(int[][] people) {
        if (people.length == 0) {
            return people;
        }

//        searching any first element with [0] and replacing with first element
        for (int i = 0; i < people.length; i++) {
            if (people[i][1] == 0) {
                int[] temp = people[0];
                people[0] = people[i];
                people[i] = temp;

                break;
            }
        }

//        searching and replacing the minimal element with [0]
        for (int i = 1; i < people.length; i++) {
            if (people[i][1] == 0 && people[i][0] < people[0][0]) {
                int[] temp = people[0];
                people[0] = people[i];
                people[i] = temp;
            }
        }

//        go through all positions from 1 to array.length - 1
        for (int i = 1; i < people.length; i++) {
            int[][] allMatches = new int[people.length][2];
            int matchCounter = 0;

//        go through all element. Write them to allMatches if they match
            for (int j = i; j < people.length; j++) {
                if (isMatched(people, i, people[j])) {
                    allMatches[matchCounter] = people[j];
                    matchCounter++;
                }
            }

//         finding out an element which the best fits the position
            int[] temp = theBestMatcher(allMatches, matchCounter);

            if (temp != people[i]) {
//         searching its index
                int place = index(people, temp);

//         replacing it with people[i]
                people[place] = people[i];
                people[i] = temp;
            }
        }

        return people;
    }

    private static int index(int[][] array, int[] arrayToBeFound) {
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == arrayToBeFound) {
                index = i;
                break;
            }
        }

        return index;
    }

    private static int[] theBestMatcher(int[][] array, int counter) {
        if (array.length == 1) {
            return array[0];
        }
        int[] theBestArray = array[0];

        for (int i = 1; i < counter; i++) {
            if (array[i][0] < theBestArray[0]) {
                theBestArray = array[i];
            }
        }

        return theBestArray;
    }

    private static boolean isMatched(int[][] array, int index, int[] arrToBeMatched) {
        System.out.println(count++ + " " + Arrays.deepToString(array));
        boolean queueIsCorrect = false;

        int numPeopleInFront = arrToBeMatched[1];
        int queue = arrToBeMatched[0];
        int count = 0;

        for (int j = 0; j < index; j++) {
            if (array[j][0] >= queue) {
                count++;
            }
        }

        if (numPeopleInFront == count) {
            queueIsCorrect = true;
        }

        return queueIsCorrect;
    }
}
