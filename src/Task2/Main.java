package Task2;

public class Main {

    public static void main(String[] args) {

        NumericFunctions<Double> n1 = new NumericFunctions<>(9.76);
        System.out.println(n1.reciprocal());      // ~0.102459016
        System.out.println(n1.fractionalPart());  // 0.76

        NumericFunctions<Integer> n2 = new NumericFunctions<>(5);
        System.out.println(n2.reciprocal());      // 0.2
        System.out.println(n2.fractionalPart());  // 0.0

        System.out.println(NumericFunctions.absEqual(-5.0, 5f)); // true
    }
}