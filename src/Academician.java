public abstract class Academician extends Worker {
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
    public abstract void attendClass();

    @Override
    public void entry() {

        System.out.println(this.getName() + " A kapısından giriş yaptı");
    }

    @Override
    public void exit() {
        System.out.println(this.getName() + " A kapısından çıkış yaptı");

    }

}
