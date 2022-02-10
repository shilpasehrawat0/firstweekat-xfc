package Generics;


class horcrux<T,M>
{
    T obj;
    M mbj;
    horcrux(T obj , M mbj){
        this.obj=obj;
        this.mbj=mbj;
    }
//    public T getObject()
//    {
//        return this.obj;
//    }

    public void show()
    {
        System.out.println(this.mbj);
        System.out.println(this.obj);
    }



}
public class UserDefined {
    public static void main(String[] args) {
//       horcrux<Integer> hobj= new horcrux<>(5);
//        hobj.show();
//        horcrux<String> hobj1= new horcrux<>("James");

        horcrux<String, Integer> hobj1 = new horcrux<>("HARRY",777);
        hobj1.show();

    }
}
