package Task3;

public class Main {
    public static void main(String[] args) {

        Pair<String, Integer> p1 = new Pair<>("Age", 20);
        System.out.println(p1);

        Pair<Integer, String> p2 = new Pair<>(1, "One");
        System.out.println(p2);

        p1.setValue(21);
        System.out.println("Updated: " + p1);
    }
}
