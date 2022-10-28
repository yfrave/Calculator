import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите арифметическую операцию. Допустимы символы (+,-,*,/)");
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String[] d = Voz.vozvrat(str1);
        int a = 0;
        int b = 0;
        String znak = d[1];
        try {
            a = Integer.parseInt(d[0]);
            b = Integer.parseInt(d[2]);
            result(a, b, znak);
            System.out.println(a + " + " + b + "= " + result(a, b, znak));
        } catch (Exception e) {
            a = romanToArab(d[0]);
            b = romanToArab(d[2]);
            int x = result(a, b, znak);
            String convert = RomanNumbers.convert(x);
            System.out.println(a + " + " + b + "= " + convert);
        }
    }

    private static int romanToArab(String roman) {
        return switch (roman) {
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            default -> throw new IllegalArgumentException("Ошибка! Не верные данные.");
        };
    }

    public static int result(int a, int b, String znak) {
        if (a > 10 | b > 10) {
            System.out.println("Числа должны быть в пределе от 1 до 10");
        }
        if (a < 1 | b < 1) {
            System.out.println("Числа должны быть в пределе от 1 до 10");
        }
        int z = switch (znak) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new IllegalArgumentException("Ошибка! Неверно введенён оператор");
        };
        return z;
    }
}

