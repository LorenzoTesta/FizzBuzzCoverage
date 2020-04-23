package xyz.testalorenzo.multiutility;

public class Internationalization {

    public String translate(String key) {
        return new String(new char[5]).replace("\0", key);
    }


}
