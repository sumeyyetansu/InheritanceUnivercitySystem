public class Academician extends Worker {
    private String departmant;
    private String title;

    public String getDepartmant() {
        return departmant;
    }

    public void setDepartmant(String departmant) {
        this.departmant = departmant;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Academician(String name, int telNumber, String email, String departmant , String title) {
        super(name, telNumber, email);
        this.departmant = departmant;
        this.title = title;

    }
    public void attendClass(){
        System.out.println(getName() + " is going to class");

    }
}
