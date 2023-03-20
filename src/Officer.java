public class Officer extends Worker {
    private String departmant;
    private String shift;
    public Officer(String name, int telNumber, String email, String departmant, String shift) {
        super(name, telNumber, email);
        this.departmant = departmant;
        this.shift = shift;
    }

    public String getDepartmant() {
        return departmant;
    }

    public void setDepartmant(String departmant) {
        this.departmant = departmant;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
    public void work(){
        System.out.println(getName() + " is working");

    }
}
