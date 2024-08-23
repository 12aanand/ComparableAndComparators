package CompartorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {

    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}

public class comparatorsWithStudent{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(45,"Anand"));
        students.add(new Student(23,"Suraj"));
        students.add(new Student(65,"Pawan"));
        students.add(new Student(12,"Hero"));
        students.add(new Student(17,"Ashish"));

//
//      Comparator is used to sort the String with age
        Comparator<Student> stud = new Comparator<Student>() {

//            this method is used to sort the student age and name accordingly.
//            this compare method is preDefine in comparator interface
//            which compare to values while sorting is not completed

            public int compare(Student i, Student j) {
                if(i.age > j.age)
                {
                    return 1;
                }
                else {
                    return -1;
                }
            }
        };

        Collections.sort(students,stud);

        for(Student s:students)
        {
            System.out.println(s);
        }

    }
}
