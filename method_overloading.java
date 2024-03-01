package functions;

public class method_overloading {
    public static void main(String[] args) {
        System.out.println(formatNUmber(10));
       // System.out.println(formatNUmber(23.45));
        System.out.println(formatNUmber("23"));



    }

    public static String formatNUmber(int value) {
        return String.format("%d", value);
    }

    public static String formatNUmber(float value) {
        return String.format("%.3f", value);
    }

    public static String formatNUmber(String value) {
        return String.format("%.2f", Double.parseDouble(value));
    }

}
