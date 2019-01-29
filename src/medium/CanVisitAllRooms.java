package medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CanVisitAllRooms {

    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(Arrays.asList(0, 1), Arrays.asList(0, 1));
        List<List<Integer>> list2 = Arrays.asList(Arrays.asList(1, 3), Arrays.asList(3, 0, 1),
                Collections.singletonList(2), Collections.singletonList(0));
        List<List<Integer>> list3 = Arrays.asList(Collections.singletonList(2), Collections.emptyList(),
                Collections.singletonList(1));
        List<List<Integer>> list4 = Arrays.asList(Arrays.asList(6, 7, 8), Arrays.asList(5, 4, 9),
                Collections.emptyList(), Collections.singletonList(8), Collections.singletonList(4),
                Collections.emptyList(), Arrays.asList(1, 9, 2, 3), Collections.singletonList(7), Arrays.asList(6, 5),
                Arrays.asList(2, 3, 1));

        System.out.println(canVisitAllRooms(list));
        System.out.println(canVisitAllRooms(list2));
        System.out.println(canVisitAllRooms(list3));
        System.out.println(canVisitAllRooms(list4));
    }

    private static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] roomsAccess = new boolean[rooms.size()];
        boolean[] roomsVisited = new boolean[rooms.size()];
        Arrays.fill(roomsAccess, false);
        Arrays.fill(roomsVisited, false);
        roomsAccess[0] = true;

        for (int i = 0; i < rooms.size(); i++) {
            if (!roomsAccess[i]) {
                continue;
            }
            roomsVisited[i] = true;

            int goBackTo = Integer.MAX_VALUE;
            for (int j = 0; j < rooms.get(i).size(); j++) {

                if (!roomsAccess[rooms.get(i).get(j)]) {
                    roomsAccess[rooms.get(i).get(j)] = true;
                }

                if (rooms.get(i).get(j) < i && !roomsVisited[rooms.get(i).get(j)] && goBackTo > rooms.get(i).get(j)) {
                    goBackTo = rooms.get(i).get(j);
                }
            }

            if (goBackTo != Integer.MAX_VALUE) {
                i = goBackTo - 1;
                roomsVisited[i] = false;
            }
        }

        boolean value = true;

        for (boolean access : roomsAccess) {
            if (!access) {
                value = false;
                break;
            }
        }

        return value;
    }
}
