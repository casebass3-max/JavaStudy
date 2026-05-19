public class App {
    public static void main(String[] args) throws Exception {

        int a = 3;
        int b = 2;
        System.out.println("a=" + a + "b=" + b);
        int sum = a + b;
        System.out.println("sum=" + sum);
        int diff = a - b;
        System.out.println("diff=" + diff);

        int x = 4;
        int y = 2;
        System.out.println("x=" + x + "y=" + y);
        int product = x * y;
        int quotient = x / y;
        System.out.println("product=" + product + "quotient=" + quotient);
        int num = 25;
        int tens = num / 10;
        int units = num % 10;
        System.out.println(num);
        System.out.println(tens);
        System.out.println(units);
        int num2 = 255;
        int hundreds = num2 / 100;
        System.out.println(num2);
        System.out.println(hundreds);
        int m = 2;
        int n = 3;
    }
}
