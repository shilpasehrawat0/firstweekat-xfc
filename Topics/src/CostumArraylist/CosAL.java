package CostumArraylist;

import java.util.ArrayList;

public class CosAL {
    int n = 4;

    static class Attributes {//innerClass- it wont depend on the object of CosAL if static
        int roll;
        static int marks;
        static String name;
        long phone;

        Attributes(int roll, String name, int marks, long phone) {
            this.roll = roll;
            Attributes.name = name;
            Attributes.marks = marks;
            this.phone = phone;
        }

        public static void main(String[] args) {
            int[] roll = {1, 2, 3, 4, 5};
            long[] phone = {12345, 6789, 9876, 54321};
            String[] name = new String[]{"Harry", "Hermione", "Ronald", "Ginny"};
            int[] marks = {12, 14, 15, 15};
            CosAL al = new CosAL();
            al.AddValues(roll, name, marks, phone);
        }
//        public void AddValues(int roll[],String name , int marks , long phone)
//        {
//            ArrayList<Attributes> al= new ArrayList<>();
//
//            for (int i = 0; i < n; i++) {
//                al.add(new Attributes(roll[i],name[i],marks[i],phone[i]));
//
//            }
//        }
    }

    public void AddValues(int[] roll, String[] name, int[] marks, long[] phone) {
        ArrayList<Attributes> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {   //adding values to arraylist al
            al.add(new Attributes(roll[i], name[i], marks[i], phone[i]));
        }
        printValues(al);
    }

    private void printValues(ArrayList<Attributes> al) { //after adding we get the values
        for (int i = 0; i < n; i++) {
            Attributes attributes = al.get(i);

            System.out.println(attributes.roll + " " + attributes.phone + " " + attributes.marks +
                    " " + attributes.name);
        }
    }
}
