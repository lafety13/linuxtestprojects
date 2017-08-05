import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");


        list.sort(String::compareTo);

        System.out.println(func(s -> s.length() > 3));


        Predicate<String> predicate = s -> s.length() > 6;
        System.out.println(predicate.test("q"));

        int i = 999;
        int result = 0;
        while (i > 0) {
            if (i % 3 == 0 || i % 5 ==0) {

                result += i;
            }
            i--;
        }
        System.out.println(result);


        System.out.println(fibRec(3));
    }



    public static int fib(int n) {
        n = n +1;
        double sqrt = Math.sqrt(5);
        double phi = (sqrt+1) / 2;

        return (int)(Math.pow(phi, n) / sqrt + 0.5);
    }

    static int fibRec(int n) {
        if (n < 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        return fibRec(n - 1) + fibRec(n - 2);
    }

    public static Boolean func(Predicate<String> predicate) {
        return predicate.test("hello");
    }
}
