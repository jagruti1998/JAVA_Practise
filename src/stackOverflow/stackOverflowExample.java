package stackOverflow;

public class  stackOverflowExample {
    static void recursiveMethod() {
        System.out.println("Calling recursiveMethod");
        recursiveMethod(); // Recursive call without base case
    }

    public static void main(String[] args) {
        recursiveMethod();
    }
}
