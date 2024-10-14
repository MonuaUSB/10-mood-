package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Egg6 {

    public Egg6(Needle7 needle) {
        this.needle = needle;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }

    private final Needle7 needle;


}
