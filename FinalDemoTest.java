package com.syntexpro2.basic;

public class FinalDemoTest {

    public static void main(String[] args) {

        FinalDemo finalDemo = new FinalDemo();
        System.out.println(finalDemo.age);
        finalDemo.age=23; //won't change, because finalized.
        System.out.println(finalDemo.age);
    }


}
