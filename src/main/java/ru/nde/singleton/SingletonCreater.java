package ru.nde.singleton;

/**
 * @author: Dmitriy E. Nosov <br>
 * @date: 14.03.14 15:15 <br>
 * @description: <br>
 */
public class SingletonCreater {

    public static void main(String[] args) {

        for (int i = 0; ++i < 100; ) {
            createThread(i);
        }
    }

    private static void createThread(final int num) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                final Once instance = Once.getInstance();
                System.out.println("" + num + ") instance = " + instance);
            }
        }, "t" + num);

        t1.start();
    }


}
