public abstract class Officer extends Worker {
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
    public abstract void work();

    @Override
    public void entry() {
        System.out.println(this.getName() + " B kapsıından giriş yaptı");
    }

    @Override
    public void exit() {
        System.out.println(this.getName() + " B kapsıından çıkış yaptı");
    }
}
