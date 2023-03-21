public class Computing extends Officer{
    private String task;

    public Computing(String name, int telNumber, String email, String departmant, String shift, String task) {
        super(name, telNumber, email, departmant, shift);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
    public void networkSetup(){
        System.out.println(getName() + " network kurdu");

    }

    @Override
    public void work() {
        System.out.println(this.getName() + " bilgisayarda çalışmaya başladı");
    }
}
