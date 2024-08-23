package CompartorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparable {
    public static void main(String[] args) {

        Comparator<Students> studs = new Comparator<Students>() {
            @Override
            public int compare(Students i, Students j) {
                if(i.age > j.age)
                {
                    return 1;
                }
                else {
                    return -1;
                }
            }
        };


        List<Students> students = new ArrayList<>();
        students.add(new Students(23,"anand"));
        students.add(new Students(89,"pawan"));
        students.add(new Students(13,"anant"));
        students.add(new Students(21,"chinmay"));

        Collections.sort(students);
        for(Students s:students){
            System.out.println(s);
        }
    }
}

//Comparable is a interface to implements a class and override the method compareTo(Object name) which compare itself
class Students implements Comparable<Students>
{

    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

//    this method is used to compare itself with another object it is comparable interface
    @Override
    public int compareTo(Students that) {
        if(this.age > that.age)
        {
            return 1;
        }
        else {
            return -1;
        }
    }
}
