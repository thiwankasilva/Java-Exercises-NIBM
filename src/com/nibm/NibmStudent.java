package com.nibm;


public class NibmStudent {
    private String name;
    private String age;
    private String address;

    public NibmStudent(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //This will convert this object into a string
    @Override
    public String toString() {
        return "NibmStudent{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
