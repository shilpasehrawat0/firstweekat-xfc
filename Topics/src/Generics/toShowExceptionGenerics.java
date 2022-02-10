package Generics;

import java.util.ArrayList;

public class toShowExceptionGenerics {     //Generic ensures typeSafety
    public static void main(String[] args) {
        ArrayList<Object> al= new ArrayList<>();   // not specifying objects  , if we specify the type then we need to typecast
                                         // it again and again,that is why Generics are useful
        al.add(34);
        al.add("Shilpa");
        al.add(7);

        System.out.println(al);

        int a= (int) al.get(0);
        String s1= (String) al.get(1);

        String s2= (String) al.get(2);

    }

}
