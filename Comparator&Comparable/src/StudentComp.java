import java.util.Arrays;
import java.util.Comparator;

public class StudentComp implements Comparable<StudentComp> {
    int rollno;
    float marks;

    public StudentComp(int rollno,float marks)
    {
        this.marks=marks;
        this.rollno=rollno;
    }

    public static void main(String[] args) {
        StudentComp Shilpa= new StudentComp(21,89.7f);
        StudentComp Rahul= new StudentComp(11,69.7f);
        StudentComp Karan= new StudentComp(41,59.7f);
        StudentComp Arpit= new StudentComp(22,79.7f);

        StudentComp[] list={Shilpa,Rahul,Karan,Arpit};
        System.out.println(Arrays.toString(list));

        Arrays.sort(list, new Comparator<StudentComp>() {
            @Override
            public int compare(StudentComp o1, StudentComp o2) {
                return -(int) (o1.marks-o2.marks);
            }
        });

        System.out.println(Arrays.toString(list));

        if(Shilpa.compareTo(Rahul)<0){
            System.out.println("Rahul has more marks");
            System.out.println(Shilpa.compareTo(Rahul));
        }
    }
    @Override
        public String toString()
        {
        return marks+" ";
        }
    @Override
    public int compareTo(StudentComp o) {
        System.out.println("InCompareToMethod");
        int diff= (int) (this.marks-o.marks);
        return diff;
    }}
