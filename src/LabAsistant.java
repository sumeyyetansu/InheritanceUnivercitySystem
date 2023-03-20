public class LabAsistant extends Assistant{
    public LabAsistant(String name, int telNumber, String email, String departmant, String title, double officeTime) {
        super(name, telNumber, email, departmant, title, officeTime);
    }
    public void attendClass(){
        System.out.println(getName() + " attand class");

    }
    public void enterTheLab(){
        System.out.println(getName() + " is gooing to enter the lab");

    }
}
