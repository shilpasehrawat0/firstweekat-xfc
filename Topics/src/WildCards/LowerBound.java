package WildCards;

import java.util.Arrays;
import java.util.List;

public class LowerBound {
    public static void main(String[] args) {
        List<String> list1= Arrays.asList("She","He");
        printIntegerOrSuper(list1);
        List<String> list2= Arrays.asList("Who","How");
        printIntegerOrSuper(list2);
    }

    private static void printIntegerOrSuper(List<?super String> list) {
        System.out.println(list);
    }
}
