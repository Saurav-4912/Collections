package UserDefinedCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Demo {

    public static void main(String[] args) {

        Student s1 = new Student(101,"AAA",78.89);
        Student s2 = new Student(102, "BBB", 89.90);
        Student s3 = new Student(103, "CCC", 56.78);

        List<Student> L = new ArrayList<>();

        L.add(s1);
        L.add(s2);
        L.add(s3);

        Collections.sort(L, new PercentageComparator());

        for(Student ob : L){
            System.out.println(ob.getRno());
            System.out.println(ob.getName());
            System.out.println(ob.getPer());
            System.out.println("---------------------");
        }

    }
}
