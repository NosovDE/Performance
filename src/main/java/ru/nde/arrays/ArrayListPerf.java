package ru.nde.arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author: Dmitriy E. Nosov <br>
 * @date: 14.03.14 14:59 <br>
 * @description: <br>
 */
public class ArrayListPerf {

    private final Random rnd = new Random();

    public static void main(String[] args) {

        arrayTest();
        linkedTest();

    }

    private static void arrayTest() {
        final List<String> arrList = new ArrayList<String>();

        long start = System.nanoTime();
        for (long i = 0; ++i < 10000000L; ) {
            arrList.add(String.format("%07d", (int) (Math.random() * 10000)));
        }
        long delta = System.nanoTime() - start;
        System.out.println("arr delta = " + delta / 1000000000 + "sec");
    }

    private static void linkedTest() {
        final List<String> linkedList = new LinkedList<String>();

        long start = System.nanoTime();
        for (long i = 0; ++i < 10000000L; ) {
            linkedList.add(String.format("%07d", (int) (Math.random() * 10000)));
        }
        long delta = System.nanoTime() - start;
        System.out.println("linked delta = " + delta / 1000000000 + "sec");
    }


}
