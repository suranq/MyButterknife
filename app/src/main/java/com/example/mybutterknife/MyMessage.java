package com.example.mybutterknife;

/**
 * Created by 马明祥 on 2018/11/12.
 */

public class MyMessage {
    String name;
    int age;

    @Override
    public String toString() {
        return "MyMessage{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public MyMessage(String name, int age) {
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
}
