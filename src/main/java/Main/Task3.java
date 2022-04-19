package Main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List ints = Collections.singletonList(cheackArray(Arrays.asList(1, 1, 4, 4, 1, 4, 4, 1, 4)));
        System.out.println(ints);

    }

    public static boolean cheackArray (List<Integer> list) {
        return list.stream()
                .noneMatch(val -> !val.equals(1) && !val.equals(4));
    }


}
