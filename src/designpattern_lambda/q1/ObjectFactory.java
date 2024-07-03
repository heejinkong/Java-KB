package designpattern_ambda.q1;

public class ObjectFactory {
public static Object createObject(String type) {
        if (type.equals("Apple")) {
            return new AppleClass();
        } else if (type.equals("Banana")) {
            return new BananaClass();
        } else if (type.equals("Ice")) {
            return new IceClass();
        } else {
            return null;
        }
    }
}
