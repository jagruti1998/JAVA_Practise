package Factory_DesignPatterns;

public class AndroidDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Getting Android Developers salary");
        return 50000;
    }
}
