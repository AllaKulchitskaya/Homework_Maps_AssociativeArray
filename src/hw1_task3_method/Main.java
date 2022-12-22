package hw1_task3_method;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final Map<String, Integer> MAP = new HashMap<>();
    public static void main(String[] args) {
        MAP.put("str1", 7);
        MAP.put("str2", 1);
        MAP.put("str3", 5);
        System.out.println(MAP);
        renewCollection("str4", 8);
        System.out.println(MAP);
        renewCollection("str1", 4);
        System.out.println(MAP);
        renewCollection("str2", 1);
        System.out.println(MAP);
    }

    private static void renewCollection(String string, Integer integer) {
        if(MAP.containsKey(string) && MAP.get(string).equals(integer)) {
            throw new IllegalArgumentException("Такая пара уже есть в коллекции");
        }
        MAP.put(string, integer);
    }
}
