package Abstract_DesignPattern;

public class WebDeveloper implements Employee{

    @Override
    public int sal() {
        return 100000;
    }

    @Override
    public String name() {
        System.out.println("I am Web developer");
        return "WebDeveloper";
    }
}
