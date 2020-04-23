package xyz.testalorenzo.multiutility;

import java.util.Arrays;

public class Caos {

    public String slowFn(String key) throws InterruptedException {
        int seconds = 1;
        Thread.sleep(seconds * 1000);
        char[] charArray = key.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public void notifySomething(String key) {
        System.out.println(key);
    }
}
