package homework2;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Map<String, List<Integer>> map = new HashMap<>();
        Random random = new Random();
        int mapSize = 5;
        int listSize = 3;
        for (int i = 0; i < mapSize; i++) {
            List<Integer> numbers = new ArrayList<>(listSize);
            for (int j = 0; j < listSize; j++) {
                numbers.add(random.nextInt(1_000));
            }
            map.put("string" + String.valueOf(i), numbers);
        }
        System.out.println(map);

        Map<String, Integer> newMap = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            int sum = 0;
            List<Integer> numbers = entry.getValue();
            for (Integer number : numbers) {
                sum += number;
            }
            newMap.put(entry.getKey(), sum);
        }
        System.out.println(newMap);
    }
}
