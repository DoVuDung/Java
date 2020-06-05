/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

/**
 *
 * @author nguyenducthao
 */
class Student implements Comparator<Student> {

    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + '}';
    }

    @Override
    public int compare(Student student1, Student student2) {
        if (student1.age == student2.age) {
            if (student1.name.compareToIgnoreCase(student2.name) == 0) {
                return 0;
            } else {
                if (student1.name.compareToIgnoreCase(student2.name) > 0) {
                    return 1;
                } else {
                    return -1;
                }
            }
        } else {
            if (student1.age > student2.age) {
                return 1;
            } else {
                return -1;
            }
        }
    }

}

public class NewClass {

    public static void main(String[] args) {
//        ArrayList<Student> list = new ArrayList<>();
//        list.add(new Student("student2", 20));
//        list.add(new Student("student1", 10));
//        list.add(new Student("student3", 30));
//        Collections.sort(list, new Student());
//        for (Student student : list) {
//            System.out.println(student);
//        }
        Vector vector1 = new Vector();
        Vector vector2 = new Vector();
        vector2.add(1);
        vector2.add(2);
        vector2.add(3);
        vector1.add(vector2);
        vector2=new Vector();
        vector2.add(4);
        vector2.add(5);
        vector2.add(6);
        vector1.add(vector2);
        for (Object object : vector1) {
            System.out.println(object);            
        }
        for (int i = 0; i < vector1.size(); i++) {
            vector2=new Vector();
            vector2=(Vector)vector1.elementAt(i);
            for (int j = 0; j < vector2.size(); j++) {
                if(Integer.valueOf(vector2.get(i).toString())==5){
                    vector2.set(i, 10);
                }
                
            }
        }
        for (Object object : vector1) {
            System.out.println(object);            
        }
    }
}
