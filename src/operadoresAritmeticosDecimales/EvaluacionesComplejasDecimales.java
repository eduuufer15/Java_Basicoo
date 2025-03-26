package operadoresAritmeticosDecimales;

public class EvaluacionesComplejasDecimales {
    public static void main(String[] args) {
        double x = 88, y = 3.5, z = -5.2;
        System.out.println("x / (y + z) = " + (x / (y + z)));
        System.out.println("(x / y) + z = " + ((x / y) + z));
        System.out.println("2 * x / 3 * y = " + (2 * x / 3 * y));
        System.out.println("2 * x / (3 * y) = " + (2 * x / (3 * y)));
        System.out.println("x * y % z = " + (x * y % z));
    }
}