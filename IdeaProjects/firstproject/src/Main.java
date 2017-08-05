
public class Main {
    public static void main(String[] args) {
        SamthingClass sameClass = new SamthingClass();
        Functional<String, String> convert = sameClass::startsWidth;
        String converted = convert.conver("Java");
        System.out.println(converted);
    }
}
