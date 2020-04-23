package xyz.testalorenzo.multiutility;

import java.util.ArrayList;
import java.util.List;

public class Utilities {

    Internationalization internationalization;
    Caos caos;

    public Utilities(Internationalization internationalization, Caos caos) {
        this.internationalization = internationalization;
        this.caos = caos;
    }

    public List<String> getCustomString(List<String> keys) {
        List<String> result = new ArrayList<>();
        try {
            for (String key: keys){
                String translatedKey = internationalization.translate(key);
                String s = caos.slowFn(translatedKey);
                String res = s + "77";
                result.add(res);
                caos.notifySomething(res);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }

}
