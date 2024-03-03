package com.nibm;
import java.util.Objects;


public class Student {
    private String name;
    private Long number;
    private int age;

    public Student(String name, Long number, int age) {
        this.name = name;
        this.number = number;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(number, student.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", age=" + age +
                '}';
    }
}

 class NIBM {
    public static void main(String args[]) {


        Student hiruni = new Student("Hiruni", 464654L,29);
        Student thiwanka = new Student("Thiwanka",464654L,26);

        System.out.println(hiruni.equals(null));

   }
}

