package Factory_DesignPatterns;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("WebDevelopers salary");
        return 100000;
    }
}
