package CostumArraylist;

import java.util.Arrays;

//https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html
public class customGenericArraylist<T>{
        private Object[] data;
        private static int DEFAULT_SIZE=10;
        private int size =0;

        public void CustomArraylist()
        {
            data= new Object[DEFAULT_SIZE];
        }

        public void add(T num){
            if(isfull())
            {
                resize();
            }
            data[size++]=num;
        }

        private void resize() {
            Object[] temp= new Object[data.length*2];

            for (int i = 0; i < data.length; i++) {
                temp[i]=data[i];
            }
            data=temp;
        }


        private boolean isfull() {
            return size==data.length;
        }

        public  T remove()
        {
            T removed = (T)data[--size];
            return removed;
        }

        public T get(int index)
        {
            return (T) data[index];
        }
        public int size()
        {
            return size;
        }
        public void set(int index , T value)
        {
            data[index]=value;
        }

        @Override
        public String toString() {
            return "CustomArraylist{" +
                    "data=" + Arrays.toString(data) +
                    ", size=" + size +
                    '}';
        }


        public static void main(String[] args) {

            // ArrayList<Integer>  list= new ArrayList<>();
            customGenericArraylist list= new customGenericArraylist();
//        list.add(12);
//        list.add(13);
//        list.add(14);

            for (int i = 0; i < 14; i++) {
                list.add(2*i);
                System.out.println(list);
            }



            System.out.println(list);

        }
    }



