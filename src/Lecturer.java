public class Lecturer extends Academician {
    private int doorNumber;

    public Lecturer(String name, int telNumber, String email, String departmant, String title, int doorNumber) {
        super(name, telNumber, email, departmant, title);
        this.doorNumber = doorNumber;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public void takeATest() {
        System.out.println(getName() + " test yapıyor");

    }

    @Override
    public void attendClass() {
        System.out.println(this.getName() + " derse girdi");

    }
}


