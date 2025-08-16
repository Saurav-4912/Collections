package UserDefinedCollection;

import java.util.Comparator;

public class PercentageComparator implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2) {

        Double per1 = o1.getPer();
        Double per2 = o2.getPer();

        return -per1.compareTo(per2);
    }
}
