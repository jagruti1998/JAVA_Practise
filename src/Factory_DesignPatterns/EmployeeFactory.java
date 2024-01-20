package Factory_DesignPatterns;

public class EmployeeFactory {

    //get the emplloyee
    public static Employee getEmployee(String empType){
        if(empType.trim().equalsIgnoreCase("AndroidDeveloper")){
            return new AndroidDeveloper();
        }
        else if(empType.trim().equalsIgnoreCase("WebDeveloper")){
            return new WebDeveloper();
        }
        else {
            return null;
        }

    }
}
