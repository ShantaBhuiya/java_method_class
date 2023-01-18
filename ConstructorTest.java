package com.syntexpro2.basic;

public class ConstructorTest {
    public static void main(String[] args) {
        Human human1  = new Human("Shanta", 22, "NY");
        Human human2  = new Human("Aziz", 23, "NY");
        Human human3  = new Human("Tanha", 24, "NY");

        System.out.println("This is human1 obeject values " + human1.name);
        System.out.println(human1.age);
        System.out.println(human1.location);

        System.out.println("This is human2 obeject values " + human2.name);
        System.out.println(human2.age);
        System.out.println(human2.location);

        System.out.println("This is human3 obeject values " + human3.name);
        System.out.println(human3.age);
        System.out.println(human3.location);

        human1.eat();

    }
}
