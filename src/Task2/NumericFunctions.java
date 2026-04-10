package Task2;

class NumericFunctions<T extends Number> {

    private T num;

    public NumericFunctions(T num) {
        this.num = num;
    }

    // b) reciprocal (safe check added)
    public double reciprocal() {
        double value = num.doubleValue();

        if (value == 0.0) {
            throw new ArithmeticException("Cannot compute reciprocal of zero.");
        }

        return 1.0 / value;
    }

    // c) fractional part (handles negative numbers correctly)
    public double fractionalPart() {
        double value = num.doubleValue();
        value = Math.abs(value);

        return value - Math.floor(value);
    }

    // d) compare absolute values of two numeric types (precision-safe)
    public static boolean absEqual(Number n1, Number n2) {
        double v1 = Math.abs(n1.doubleValue());
        double v2 = Math.abs(n2.doubleValue());

        return Math.abs(v1 - v2) < 1e-9;
    }
}