package Main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Array {
    public static void main(String[] args) throws Exception {
        Integer i = 4;
        List ints = (Arrays.asList(1, 2, 4, 4, 2, 3, 4, 1, 7));
        if (!ints.contains(i)) {
            throw new RuntimeException();
        }
        List ints2 = findArray(ints);
        System.out.println(ints2);
    }

    public static List<Integer> findArray(List<Integer> list) {
        return list.stream()
                .dropWhile(value -> !value.equals(4))
                .dropWhile(value -> value.equals(4))
                .dropWhile(value -> !value.equals(4))
                .filter(value -> !value.equals(4))
                .collect(Collectors.toList());
    }

}