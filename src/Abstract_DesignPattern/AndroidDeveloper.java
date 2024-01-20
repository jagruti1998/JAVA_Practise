package Abstract_DesignPattern;

public class AndroidDeveloper implements Employee{
    public int sal() {
        return 50000;
    }

    public String name() {
        System.out.println("I am android developer");
        return "AndroidDeveloper";
    }
}
