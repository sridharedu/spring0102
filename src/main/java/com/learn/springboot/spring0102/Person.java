package com.learn.springboot.spring0102;

public class Person {
    int age;
    String name;
    Department dept;

    public Person(int age, String name, Department dept) {
        this.age = age;
        this.name = name;
        this.dept = dept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }
}
