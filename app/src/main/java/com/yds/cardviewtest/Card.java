package com.yds.cardviewtest;

/**
 * Created by DC on 2016/6/26.
 */
public class Card {
    //名字
    private String name;

    //年纪
    private String age;

    public Card() {
    }

    /**
     * getter && setter
     * @param name
     * @param age
     */
    public Card(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
