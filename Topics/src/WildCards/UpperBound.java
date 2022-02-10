package WildCards;

import java.util.Arrays;
import java.util.List;

public class UpperBound { //?represents Unknown type
    public static void main(String[] args) {
        List<Number> list1 = Arrays.asList(4, 5, 6, 7);
        System.out.println("Total Sum is: " + sum(list1));
        List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);
        System.out.println("Total Sum is: " + sum(list2));
    }

    class GrandParent {

    }

    class Parent extends GrandParent {

    }

    class Child extends Parent {

    }

    public static void test(List<? extends Parent> children) {

    }

    public static void test2(List<? super Parent> parent) {

    }

    public static double sum(List<? extends Number> list)  // subclasses allowed with this convention
    // (List<Number> list) No subclasses allowed with this convention
    {
        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }
        return sum;
    }
}



