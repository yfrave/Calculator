public class Voz {
    public static String[] vozvrat(String str1) {
        String[] strings = str1.split(" ");
        if (strings.length < 3 | strings.length > 3) {
            throw new IllegalArgumentException("Введены некорректные данные");
        }
        return strings;
    }
}
