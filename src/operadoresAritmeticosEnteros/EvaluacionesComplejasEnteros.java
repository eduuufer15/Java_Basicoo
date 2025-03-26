package operadoresAritmeticosEnteros;

public class EvaluacionesComplejasEnteros {
    public static void main(String[] args) {
        int a = 8, b = 3, c = -5;
        System.out.println("a / c = " + (a / c));
        System.out.println("a % c = " + (a % c));
        System.out.println("a * b / c = " + (a * b / c));
        System.out.println("a * (b / c) = " + (a * (b / c)));
        System.out.println("(a * c) % b = " + ((a * c) % b));
    }
}