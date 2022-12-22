package homework2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        int mapSize = 10;
        for (int i = 0; i < mapSize; i++) {
            map.put(i, "string" + String.valueOf(i));
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
