package hw1_task2_product;

public class StringUtils {
    public static boolean isValid (String string) {
        return string == null || string.isEmpty() || string.isBlank();
    }
}
